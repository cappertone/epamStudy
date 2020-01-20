package com.epam.autumn.politech.ht10.behavioral.visitor;

public class Rockman implements Visitor {
    @Override
    public void visit(Drums drums) {
        System.out.println("Play fast");
    }

    @Override
    public void visit(Bass bass) {
        System.out.println("Play with attack");
    }

    @Override
    public void visit(Guitar guitar) {
        System.out.println("Play loud");
    }

    @Override
    public void visit(Element element) {

    }
}
