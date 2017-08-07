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
                    .cform-field {
                        padding: 5px 0;
                    }
                    .cform-field > label {
                        display: inline-block;
                        width: 50%;
                    }
                    .cform-choice-option {
                        display: inline-block;
                    }
                    .cform-field > select,
                    .cform-field > input {
                        box-sizing: border-box;
                        width: calc(50% - 10px);
                    }
                    .cform-button {
                        text-align: center;
                        padding: 5px 0;
                    }
                    .cform-button button {
                        min-width: 200px;
                    }
                </style>
            </head>

            <body>
                «formHtml»
                <script type="text/javascript" src="cform.js" charset="utf-8"></script>
                <script type="text/javascript" src="simple.js" charset="utf-8"></script>
            </body>
        </html>
    '''

    private def String createJavaScript() '''
        var cform = (function(document) {
            'use strict';

            const CLASSES = {
                get ELEMENT() { return 'cform-element'; }
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
                constructor({ calculations }) {
                    this.store = {};
                    this.calculations = calculations.map(this._initiateCalculations, this);
                }

                _initiateCalculations(entry) {
                    const clone = Object.assign({}, CALCULTATE_DEFAULTS, entry);
                    clone.calculate = clone.calculate.bind(this);
                    return clone;
                }

                processChange(event) {
                    if (!event.target.closest('.' + CLASSES.ELEMENT)) {
                      return;
                    }

                    var key = event.target.name;
                    this.store[key] = event.target.value;
                    this._updateResults(key);
                }

                getValue(field) {
                    return this.store[field];
                }

                setValue(field, value) {
                    this.store[field] = value;
                    document.querySelector('.' + CLASSES.ELEMENT + ' input[name=\"' + field + '\"]').value = value;
                }

                _updateResults(field) {
                    this.calculations.filter(c => c.input.includes(field)).forEach(c => this._execCalculate(c));
                }

                _execCalculate(entry) {
                    const value = entry.calculate();
                    if (isNaN(value)) {
                        return;
                    }
                    this.setValue(entry.output, value);
                    this._updateResults(entry.output);
                }
            }

            function initiate(settings) {
                const cform = new Cform(Object.assign({}, DEFAULTS, settings));
                instances.push(cform);
            }

            const instances = [];
            document.addEventListener("change", e => instances.forEach(i => i.processChange(e)));

            return {
                init: initiate
            };
        })(document);
    '''
}
