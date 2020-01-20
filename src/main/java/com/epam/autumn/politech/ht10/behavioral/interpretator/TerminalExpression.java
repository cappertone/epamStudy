package com.epam.autumn.politech.ht10.behavioral.interpretator;

public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data){
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {

        if(context.endsWith(data.substring(1))&&context.startsWith(data.substring(0,1))){

            return true;
        }
        return false;
    }
}
