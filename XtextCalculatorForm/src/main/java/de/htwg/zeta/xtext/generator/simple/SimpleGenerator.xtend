package de.htwg.zeta.xtext.generator.simple

import de.htwg.zeta.xtext.calculatorForm.Model
import org.eclipse.xtext.generator.IFileSystemAccess2

/**
 * Create a html with basic html.
 */
class SimpleGenerator {

    new(IFileSystemAccess2 fsa, Model model, String name) {
        val form = new SimpleFormTransformer().transform(model.formElements)
        fsa.generateFile(name + ".html", createHtmlBootrap(form, name))
        val calculation = new SimpleCalculateTransformer().tranform(model.calculations)
        fsa.generateFile(name + ".js", createJavaScript(calculation))
    }

    private def String createHtmlBootrap(String content, String name) '''
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
                <script type="text/javascript" src="«name».js" charset="utf-8"></script>
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
