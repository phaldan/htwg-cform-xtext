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
        val calculation = new SimpleCalculateTransformer().tranform(form.calculations)
        fsa.generateFile(form.name + "/simple-demo.html", createHtmlDemo(formHtml, calculation))
        fsa.generateFile(form.name + "/simple.html", formHtml)
        fsa.generateFile(form.name + "/cform.js", createJavaScript())
        fsa.generateFile(form.name + "/simple.js", calculation)
    }

    private def String createHtmlDemo(String formHtml, String calculation) '''
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
                    cform.init(document.querySelectorAll('.cform'), { calculations });
                </script>
            </body>
        </html>
    '''

    private def String createJavaScript() '''
        var cform = (function(document) {
            'use strict';

            const CLASSES = {
                get ELEMENT() { return 'cform-element'; },
                get FIELD() { return 'cform-field'; }
            };

            const DEFAULTS = {
                calculations: []
            };

            const CALCULTATE_DEFAULTS = {
                calculate: function() {},
                input: [],
                output: null
            };

            class Cform {
                constructor(element, { calculations }) {
                    this.element = element;
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
                    this.store = {};
                    fields.forEach(element => {
                        if (element instanceof HTMLInputElement) {
                            this.store[element.name] = element.value;
                        }
                    });
                }

                _initialCalculation() {
                    const fields = Object.keys(this.store);
                    fields.forEach(f => this._runDependingCalculations(f));
                }

                processChange(event) {
                    if (!event.target.closest('.' + CLASSES.ELEMENT) || !this.element.contains(event.target)) {
                      return;
                    }

                    var key = event.target.name;
                    this.store[key] = event.target.value;
                    this._runDependingCalculations(key);
                }

                _setFieldValue(field, value) {
                    const selector = '.' + CLASSES.ELEMENT + ' input[name=\"' + field + '\"]';
                    const element = document.querySelector(selector);
                    element.value = value;
                }

                _runDependingCalculations(field) {
                    const calculations = this.calculations.filter(c => c.input.includes(field));
                    calculations.forEach(c => this._execCalculate(c));
                }

                _execCalculate(entry) {
                    const value = entry.calculate();
                    if (isNaN(value)) {
                        return;
                    }
                    this.store[entry.output] = value;
                    this._setFieldValue(entry.output, value);
                    this._runDependingCalculations(entry.output);
                }

                getValue(field) {
                    return this.store[field];
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
                var elements = (element instanceof Element) ? [element] : Array.prototype.slice.call(element);
                return elements.map(e => {
                    const cform = new Cform(e, Object.assign({}, DEFAULTS, settings));
                    instances.push(cform);
                    return cform;
                });
            }

            const instances = [];
            document.addEventListener("change", e => instances.forEach(i => i.processChange(e)));

            return {
                init: initiate
            };
        })(document);
    '''
}
