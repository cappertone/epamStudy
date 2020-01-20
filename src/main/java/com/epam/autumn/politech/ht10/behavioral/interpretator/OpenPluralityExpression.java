package com.epam.autumn.politech.ht10.behavioral.interpretator;

public class OpenPluralityExpression implements Expression {

    private Expression expr1 = null;
    private Expression expr2 = null;

    public OpenPluralityExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context) || expr2.interpret(context);
    }
}
