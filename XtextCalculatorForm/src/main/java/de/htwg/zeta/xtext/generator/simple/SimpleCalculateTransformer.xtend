package de.htwg.zeta.xtext.generator.simple

import de.htwg.zeta.xtext.calculatorForm.ArithmeticSigned
import de.htwg.zeta.xtext.calculatorForm.BooleanNegation
import de.htwg.zeta.xtext.calculatorForm.Button
import de.htwg.zeta.xtext.calculatorForm.Calculate
import de.htwg.zeta.xtext.calculatorForm.Expression
import de.htwg.zeta.xtext.calculatorForm.Field
import de.htwg.zeta.xtext.calculatorForm.FieldChoice
import de.htwg.zeta.xtext.calculatorForm.FieldInput
import de.htwg.zeta.xtext.calculatorForm.FieldSelect
import de.htwg.zeta.xtext.calculatorForm.FloatLiteral
import de.htwg.zeta.xtext.calculatorForm.Minus
import de.htwg.zeta.xtext.calculatorForm.NumberLiteral
import de.htwg.zeta.xtext.calculatorForm.PercentLiteral
import de.htwg.zeta.xtext.calculatorForm.Plus
import java.math.BigDecimal
import java.util.HashSet
import java.util.List
import de.htwg.zeta.xtext.calculatorForm.Multi
import de.htwg.zeta.xtext.calculatorForm.Div
import de.htwg.zeta.xtext.calculatorForm.ResultOutput
import de.htwg.zeta.xtext.calculatorForm.OutputField
import de.htwg.zeta.xtext.calculatorForm.ReferenceLiteral
import de.htwg.zeta.xtext.calculatorForm.Literal
import de.htwg.zeta.xtext.calculatorForm.UnaryOperation
import de.htwg.zeta.xtext.calculatorForm.ExpressionVariable
import de.htwg.zeta.xtext.calculatorForm.CalculateVariable

/**
 * Create a html with basic html.
 */
class SimpleCalculateTransformer {

    private val fields = new HashSet<String>()
    private val variables = new HashSet<String>()

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
                return «processExpression(calculate.expression)»
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
            ''' '«name(output.field)»' '''.toString.trim
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

    private def String name(Field field) {
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

    private def String processExpression(Expression expression) {
        if (expression instanceof Plus) {
            '''this.mathPlus(«processExpression(expression.left)», «processExpression(expression.right)»)'''
        } else if (expression instanceof Minus) {
            '''this.mathMinus(«processExpression(expression.left)», «processExpression(expression.right)»)'''
        } else if (expression instanceof Multi) {
            '''this.mathMulti(«processExpression(expression.left)», «processExpression(expression.right)»)'''
        } else if (expression instanceof Div) {
            '''this.mathDiv(«processExpression(expression.left)», «processExpression(expression.right)»)'''
        } else if (expression instanceof UnaryOperation) {
            processUnaryOperation(expression)
        } else if (expression instanceof Literal) {
            processLiteral(expression)
        } else {
            throw new UnsupportedOperationException("Unknown Expression: " + expression.getClass.getName)
        }
    }

    private def String processUnaryOperation(UnaryOperation operation) {
        if (operation instanceof BooleanNegation) {
            '''!Boolean(«processExpression(operation.expression)»)'''
        } else if (operation instanceof ArithmeticSigned) {
            '''-Number(«processExpression(operation.expression)»)'''
        } else {
            throw new UnsupportedOperationException("Unknown UnaryOperation: " + operation.getClass.getName)
        }
    }

    private def String processLiteral(Literal literal) {
        if (literal instanceof NumberLiteral) {
            literal.value.toString
        } else if (literal instanceof FloatLiteral) {
            literal.value.toString
        } else if (literal instanceof PercentLiteral) {
            new BigDecimal(literal.value.replace("%", "")).divide(BigDecimal.valueOf(100)).toString
        } else if (literal instanceof ReferenceLiteral) {
            processExpressionVariable(literal.ref)
        } else {
            throw new UnsupportedOperationException("Unknown Literal: " + literal.getClass.getName)
        }
    }

    private def String processExpressionVariable(ExpressionVariable variable) {
        if (variable instanceof Field) {
            processFieldReference(variable)
        } else if (variable instanceof CalculateVariable) {
            processOutputVariable(variable)
        } else {
            throw new UnsupportedOperationException("Unknown ExpressionVariable: " + variable.getClass.getName)
        }
    }

    private def String processFieldReference(Field field) {
        val name = name(field)
        fields.add(name)
        '''this.resolveFieldValue('«name»')'''
    }

    private def String processOutputVariable(CalculateVariable variable) {
        variables.add(variable.name)
        '''this.resolveVariableValue('«variable.name»')'''
    }
}
