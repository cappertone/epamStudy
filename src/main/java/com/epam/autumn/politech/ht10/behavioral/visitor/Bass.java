package com.epam.autumn.politech.ht10.behavioral.visitor;

public class Bass implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
