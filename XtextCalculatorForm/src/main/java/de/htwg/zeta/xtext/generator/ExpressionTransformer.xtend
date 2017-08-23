package de.htwg.zeta.xtext.generator

import de.htwg.zeta.xtext.calculatorForm.ArithmeticSigned
import de.htwg.zeta.xtext.calculatorForm.BooleanNegation
import de.htwg.zeta.xtext.calculatorForm.CalculateVariable
import de.htwg.zeta.xtext.calculatorForm.Div
import de.htwg.zeta.xtext.calculatorForm.Expression
import de.htwg.zeta.xtext.calculatorForm.Field
import de.htwg.zeta.xtext.calculatorForm.FloatLiteral
import de.htwg.zeta.xtext.calculatorForm.InputVariable
import de.htwg.zeta.xtext.calculatorForm.Literal
import de.htwg.zeta.xtext.calculatorForm.Minus
import de.htwg.zeta.xtext.calculatorForm.Multi
import de.htwg.zeta.xtext.calculatorForm.NumberLiteral
import de.htwg.zeta.xtext.calculatorForm.PercentLiteral
import de.htwg.zeta.xtext.calculatorForm.Plus
import de.htwg.zeta.xtext.calculatorForm.ReferenceLiteral
import de.htwg.zeta.xtext.calculatorForm.UnaryOperation

abstract class ExpressionTransformer {

    def String transform(Expression expression) {
        if (expression instanceof Plus) {
            transformPlus(transform(expression.left), transform(expression.right))
        } else if (expression instanceof Minus) {
            transformMinus(transform(expression.left), transform(expression.right))
        } else if (expression instanceof Multi) {
            transformMulti(transform(expression.left), transform(expression.right))
        } else if (expression instanceof Div) {
            transformDiv(transform(expression.left), transform(expression.right))
        } else if (expression instanceof UnaryOperation) {
            processUnaryOperation(expression)
        } else if (expression instanceof Literal) {
            processLiteral(expression)
        } else {
            throw new UnsupportedOperationException("Unknown Expression: " + expression.getClass.getName)
        }
    }

    protected def String transformPlus(String left, String right)

    protected def String transformMinus(String left, String right)

    protected def String transformMulti(String left, String right)

    protected def String transformDiv(String left, String right)

    private def String processUnaryOperation(UnaryOperation operation) {
        if (operation instanceof BooleanNegation) {
            transformBooleanNegation(transform(operation.expression))
        } else if (operation instanceof ArithmeticSigned) {
            transformArithmeticSigned(transform(operation.expression))
        } else {
            throw new UnsupportedOperationException("Unknown UnaryOperation: " + operation.getClass.getName)
        }
    }

    protected def String transformBooleanNegation(String expression)

    protected def String transformArithmeticSigned(String expression)

    private def String processLiteral(Literal literal) {
        if (literal instanceof NumberLiteral) {
            transformNumberLiteral(literal)
        } else if (literal instanceof FloatLiteral) {
            transformFloatLiteral(literal)
        } else if (literal instanceof PercentLiteral) {
            transformPercentLiteral(literal)
        } else if (literal instanceof ReferenceLiteral) {
            processExpressionVariable(literal.ref)
        } else {
            throw new UnsupportedOperationException("Unknown Literal: " + literal.getClass.getName)
        }
    }

    protected def String transformNumberLiteral(NumberLiteral literal)

    protected def String transformFloatLiteral(FloatLiteral literal)

    protected def String transformPercentLiteral(PercentLiteral literal)

    private def String processExpressionVariable(InputVariable variable) {
        if (variable instanceof Field) {
            transformFieldReference(variable)
        } else if (variable instanceof CalculateVariable) {
            transformVariableReference(variable)
        } else {
            throw new UnsupportedOperationException("Unknown ExpressionVariable: " + variable.getClass.getName)
        }
    }

    protected def String transformFieldReference(Field literal)

    protected def String transformVariableReference(CalculateVariable variable)
}