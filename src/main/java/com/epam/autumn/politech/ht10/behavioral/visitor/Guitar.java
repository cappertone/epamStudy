package com.epam.autumn.politech.ht10.behavioral.visitor;

public class Guitar implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
