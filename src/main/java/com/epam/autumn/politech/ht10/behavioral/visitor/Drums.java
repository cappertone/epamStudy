package com.epam.autumn.politech.ht10.behavioral.visitor;

public class Drums implements Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
