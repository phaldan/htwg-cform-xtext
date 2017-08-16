package de.htwg.zeta.xtext.generator.simple

import de.htwg.zeta.xtext.calculatorForm.Model
import org.eclipse.xtext.generator.IFileSystemAccess2
import de.htwg.zeta.xtext.calculatorForm.Form

/**
 * Create a html with basic html.
 */
class SimpleGenerator {

    private IFileSystemAccess2 fsa

    new(IFileSystemAccess2 fsa) {
        this.fsa = fsa
    }

    public def generate(Model model) {
        for (Form form: model.forms) {
            generateForm(form)
        }
    }

    private def generateForm(Form form) {
        val formHtml = new SimpleFormTransformer().transform(form.formElements)
        val calculation = new SimpleCalculateTransformer().tranform(form.calculations, form.name)
        fsa.generateFile(form.name + "/simple-demo.html", createHtmlDemo(formHtml, form.name))
        fsa.generateFile(form.name + "/simple-template.html", createHtmlTemplate(formHtml))
        fsa.generateFile(form.name + "/simple.html", formHtml)
        fsa.generateFile(form.name + "/cform.js", createJavaScript())
        fsa.generateFile(form.name + "/simple.js", calculation)
    }

    private def String createHtmlDemo(String formHtml, String name) '''
        <!doctype html>

        <html lang="en">
            <head>
                <meta charset="utf-8">
                <title>CalculatorForm</title>
                <style>
                    .cform-element {
                        padding: 5px 0;
                        display: block;
                    }
                    .cform-element > .cform-label {
                        display: inline-block;
                        width: 50%;
                    }
                    .cform-element > select,
                    .cform-element > input[type="text"] {
                        box-sizing: border-box;
                        width: calc(50% - 10px);
                    }
                    .cform-input {
                        text-align: right;
                    }
                    .cform-button {
                        text-align: center;
                        min-width: 200px;
                    }
                </style>
            </head>

            <body>
                <div class="cform">
                    «formHtml»
                </div>
                <script type="text/javascript" src="cform.js" charset="utf-8"></script>
                <script type="text/javascript" src="simple.js" charset="utf-8"></script>
                <script>
                    cform.init(document.querySelectorAll('.cform'), { calculations: cform_«name» });
                </script>
            </body>
        </html>
    '''

    private def String createHtmlTemplate(String content) '''
        <script type="text/javascript" src="cform.js" charset="utf-8"></script>
        <template>
            <div class="cform">
                «content»
            </div>
        </template>
    '''

    private def String createJavaScript() '''
        const cform = (function(document) {
            'use strict';

            const CLASSES = {
                get ELEMENT() { return 'cform-element'; },
                get FIELD() { return 'cform-field'; }
            };

            const DEFAULTS = {
                calculations: [],
                formatInput: function(value, element) { return value; },
                formatOutput: function(value, element) { return value; }
            };

            const CALCULTATE_DEFAULTS = {
                calculate: function() {},
                input: [],
                output: null
            };

            class Cform {
                constructor(element, { calculations, formatInput, formatOutput }) {
                    this.element = element;
                    this.formatInput = formatInput;
                    this.formatOutput = formatOutput;
                    this.calculations = calculations.map(this._initCalculation, this);
                    this._initStore();
                    this._initialCalculation();
                }

                _initCalculation(entry) {
                    const clone = Object.assign({}, CALCULTATE_DEFAULTS, entry);
                    clone.calculate = clone.calculate.bind(this);
                    return clone;
                }

                _initStore() {
                    const fields = this.element.querySelectorAll('.' + CLASSES.FIELD);
                    this.store = { fields: {}, variables: {} };
                    fields.forEach(element => {
                        const value = this._getFieldValue(element);
                        this._setStoreFromField(element, element.value);
                    });
                }

                _getFieldValue(element) {
                    if (element instanceof HTMLInputElement) {
                        return element.value;
                    } else {
                        return undefined;
                    }
                }

                _setStoreFromField(element, value) {
                    this.store.fields[element.name] = this.formatInput(value, element);
                }

                _initialCalculation() {
                    const fields = Object.keys(this.store.fields);
                    fields.forEach(field => this._runDependingCalculations({ field }));
                }

                processChange(event) {
                    this.update(event.target);
                }

                update(element) {
                    if (!element.closest('.' + CLASSES.ELEMENT) || !this.element.contains(element)) {
                      return;
                    }

                    this._setStoreFromField(element, element.value);
                    this._runDependingCalculations({ field: element.name });
                }

                _setFieldValue(fieldName, value) {
                    const selector = '.' + CLASSES.ELEMENT + ' input[name=\"' + fieldName + '\"]';
                    const element = document.querySelector(selector);
                    element.value = this.formatOutput(value, element);
                }

                _runDependingCalculations(element) {
                    const calculations = this._filterDependingCalculations(element);
                    calculations.forEach(c => this._execCalculate(c));
                }

                _filterDependingCalculations(element) {
                    if (element.field) {
                        return this.calculations.filter(c => c.input.fields.includes(element.field));
                    } else if (element.variable) {
                        return this.calculations.filter(c => c.input.variables.includes(element.variable));
                    }
                }

                _execCalculate(entry) {
                    const value = Number(entry.calculate());
                    if (isNaN(value)) {
                        return;
                    }
                    this._storeOutput(entry.output, value);
                    this._runDependingCalculations(entry.output);
                }

                _storeOutput(output, value) {
                    if (output.field) {
                        this.store.fields[output.field] = value;
                        this._setFieldValue(output.field, value);
                    } else if (output.variable) {
                        this.store.variables[output.variable] = value;
                    }
                }

                resolveFieldValue(fieldName) {
                    return this.store.fields[fieldName];
                }

                resolveVariableValue(variableName) {
                    return this.store.variables[variableName];
                }

                mathPlus(left, right) {
                    const leftNum = Number(left);
                    const rightNum = Number(right);
                    const factor = this._getCalculationFaktor(leftNum, rightNum);
                    return (Math.round(leftNum * factor) + Math.round(rightNum * factor)) / factor;
                }

                mathMinus(left, right) {
                    const leftNum = Number(left);
                    const rightNum = Number(right);
                    const factor = this._getCalculationFaktor(leftNum, rightNum);
                    return (Math.round(leftNum * factor) - Math.round(rightNum * factor)) / factor;
                }

                mathMulti(left, right) {
                    const leftNum = Number(left);
                    const rightNum = Number(right);
                    const factor = this._getCalculationFaktor(leftNum, rightNum);
                    return Math.round(leftNum * factor) * Math.round(rightNum * factor) / (factor * factor);
                }

                mathDiv(left, right) {
                    const leftNum = Number(left);
                    const rightNum = Number(right);
                    const factor = this._getCalculationFaktor(leftNum, rightNum);
                    return Math.round(leftNum * factor) / Math.round(rightNum * factor);
                }

                _getCalculationFaktor() {
                    return Array.prototype.reduce.call(arguments, (prev, next) => {
                        return Math.max(prev, this._shiftCalculationFaktor(next));
                    }, 1);
                }

                _shiftCalculationFaktor(x) {
                    const parts = x.toString().split('.');
                    return (parts.length < 2) ? 1 : Math.pow(10, parts[1].length);
                }
            }

            function initiate(element, settings) {
                const elements = (element instanceof Element) ? [element] : Array.prototype.slice.call(element);
                const cforms = elements.map(e => {
                    const cform = new Cform(e, Object.assign({}, DEFAULTS, settings));
                    instances.push(cform);
                    return cform;
                });
                const update = (element) => {
                    cforms.forEach(c => c.update(element));
                }
                return { update };
            }

            const instances = [];
            document.addEventListener("change", e => instances.forEach(i => i.processChange(e)));

            return {
                init: initiate
            };
        })(document);
    '''
}
