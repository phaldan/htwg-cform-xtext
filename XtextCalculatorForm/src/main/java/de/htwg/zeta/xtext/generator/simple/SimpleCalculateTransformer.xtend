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
import de.htwg.zeta.xtext.calculatorForm.FieldReference
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

/**
 * Create a html with basic html.
 */
class SimpleCalculateTransformer {

    private val fields = new HashSet<String>()

    public def String tranform(List<Calculate> list) '''
        var calculations = [
            «FOR calculate: list SEPARATOR ','»
                «processCalculate(calculate)»
            «ENDFOR»
        ];
    '''

    private def String processCalculate(Calculate calculate) '''
        {
            calculate: function() {
                return «fields.clear»«processExpression(calculate.expression)»
            },
            input: [«FOR field: fields SEPARATOR ','»'«field»'«ENDFOR»],
            output: '«name(calculate.result)»'
        }
    '''

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
        } else if (expression instanceof BooleanNegation) {
            '''!Boolean(«processExpression(expression.expression)»)'''
        } else if (expression instanceof ArithmeticSigned) {
            '''-Number(«processExpression(expression.expression)»)'''
        } else if (expression instanceof NumberLiteral) {
            expression.value.toString
        } else if (expression instanceof FloatLiteral) {
            expression.value.toString
        } else if (expression instanceof PercentLiteral) {
            new BigDecimal(expression.value.replace("%", "")).divide(BigDecimal.valueOf(100)).toString
        } else if (expression instanceof FieldReference) {
            processFieldReference(expression)
        } else {
            throw new UnsupportedOperationException("Unknown Expression: " + expression.getClass.getName)
        }
    }

    private def String processFieldReference(FieldReference expression) {
        val name = name(expression.ref)
        fields.add(name)
        '''this.getValue('«name»')'''
    }
}
