package com.epam.autumn.politech.ht10.behavioral.visitor;

public interface Visitor {
    void visit(Drums drums);
    void visit(Bass bass);
    void visit(Guitar guitar);
    void visit (Element element);
}
