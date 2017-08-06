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
        fsa.generateFile(form.name + "/simple-demo.html", createHtmlDemo(formHtml))
        fsa.generateFile(form.name + "/simple.html", formHtml)
        val calculation = new SimpleCalculateTransformer().tranform(form.calculations)
        fsa.generateFile(form.name + "/simple.js", createJavaScript(calculation))
    }

    private def String createHtmlDemo(String content) '''
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
                «content»
                <script type="text/javascript" src="simple.js" charset="utf-8"></script>
            </body>
        </html>
    '''

    private def String createJavaScript(String content) '''
        (function(document) {
            const classes = {
                element: 'cform-element'
            };

            const instances = [];
            document.addEventListener("change", e => instances.forEach(i => i.processChange(e)));

            class Cform {
                constructor(calculations) {
                    this.store = {};
                    this.calculations = calculations.map(e => Object.assign({}, e));
                }

                processChange(event) {
                    if (!event.target.closest('.' + classes.element)) {
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
                    document.querySelector('.' + classes.element + ' input[name=\"' + field + '\"]').value = value;
                }

                _updateResults(field) {
                    calculations.filter(c => c.input.includes(field)).forEach(c => this._execCalculate(c));
                }
                _execCalculate(entry) {
                    const expression = entry.calculate.bind(this);
                    const value = expression();
                    if (isNaN(value)) {
                        return;
                    }
                    this.setValue(entry.output, value);
                    this._updateResults(entry.output);
                }
            }
            «content»
            instances.push(new Cform(calculations));
        })(document);
    '''
}
