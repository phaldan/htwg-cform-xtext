package de.htwg.zeta.xtext.generator.simple

import de.htwg.zeta.xtext.calculatorForm.Button
import de.htwg.zeta.xtext.calculatorForm.Calculate
import de.htwg.zeta.xtext.calculatorForm.CalculateVariable
import de.htwg.zeta.xtext.calculatorForm.Field
import de.htwg.zeta.xtext.calculatorForm.FieldChoice
import de.htwg.zeta.xtext.calculatorForm.FieldInput
import de.htwg.zeta.xtext.calculatorForm.FieldSelect
import de.htwg.zeta.xtext.calculatorForm.FloatLiteral
import de.htwg.zeta.xtext.calculatorForm.NumberLiteral
import de.htwg.zeta.xtext.calculatorForm.OutputField
import de.htwg.zeta.xtext.calculatorForm.PercentLiteral
import de.htwg.zeta.xtext.calculatorForm.ResultOutput
import de.htwg.zeta.xtext.generator.ExpressionTransformer
import java.math.BigDecimal
import java.util.HashSet
import java.util.List
import java.util.Set

/**
 * Create a html with basic html.
 */
class SimpleCalculateTransformer {

    private val fields = new HashSet<String>()
    private val variables = new HashSet<String>()
    private val expressionTransformer = new Transformer(fields, variables)

    public def String tranform(List<Calculate> list, String name) '''
        var cform_«name» = [
            «FOR calculate: list SEPARATOR ','»
                «fields.clear»«variables.clear»«processCalculate(calculate)»
            «ENDFOR»
        ];
    '''

    private def String processCalculate(Calculate calculate) '''
        {
            calculate: function() {
                return «expressionTransformer.transform(calculate.expression)»
            },
            input: {
                fields: [«FOR field: fields SEPARATOR ','»'«field»'«ENDFOR»],
                variables: [«FOR variable: variables SEPARATOR ','»'«variable»'«ENDFOR»],
            },
            output: {
                field: «getOutputField(calculate.output)»,
                variable: «getOutputVariable(calculate.output)»
            }
        }
    '''

    private def String getOutputField(ResultOutput output) {
        if (output instanceof OutputField) {
            ''' '«expressionTransformer.name(output.field)»' '''.toString.trim
        } else {
            '''null'''
        }
    }

    private def String getOutputVariable(ResultOutput output) {
        if (output instanceof CalculateVariable) {
            ''' '«output.name»' '''.toString.trim
        } else {
            '''null'''
        }
    }

    private static class Transformer extends ExpressionTransformer {

        private val Set<String> fields
        private val Set<String> variables

        new(Set<String> fields, Set<String> variables) {
            this.fields = fields
            this.variables = variables
        }

        public def String name(Field field) {
            if (field instanceof FieldInput) {
                field.name
            } else if (field instanceof FieldChoice) {
                field.name
            } else if (field instanceof FieldSelect) {
                field.name
            } else if (field instanceof Button) {
                field.name
            } else {
                throw new UnsupportedOperationException("Unknown Field: " + field.getClass.getName)
            }
        }

        override transformPlus(String left, String right) {
            '''this.mathPlus(«left», «right»)'''
        }

        override transformMinus(String left, String right) {
            '''this.mathMinus(«left», «right»)'''
        }

        override transformMulti(String left, String right) {
            '''this.mathMulti(«left», «right»)'''
        }

        override transformDiv(String left, String right) {
            '''this.mathDiv(«left», «right»)'''
        }

        override transformBooleanNegation(String expression) {
            '''!Boolean(«expression»)'''
        }

        override transformArithmeticSigned(String expression) {
            '''-Number(«expression»)'''
        }

        override transformNumberLiteral(NumberLiteral literal) {
            literal.value.toString
        }

        override transformFloatLiteral(FloatLiteral literal) {
            literal.value.toString
        }

        override transformPercentLiteral(PercentLiteral literal) {
            new BigDecimal(literal.value.replace("%", "")).divide(BigDecimal.valueOf(100)).toString
        }

        override transformFieldReference(Field literal) {
            val name = name(literal)
            fields.add(name)
            '''this.resolveFieldValue('«name»')'''
        }

        override transformVariableReference(CalculateVariable variable) {
            variables.add(variable.name)
            '''this.resolveVariableValue('«variable.name»')'''
        }
    }
}
