package com.epam.autumn.politech.ht10.behavioral.visitor;


public class Jazzmen implements Visitor {
    @Override
    public void visit(Drums drums) {
        System.out.println("Play slowly");
    }

    @Override
    public void visit(Bass bass) {
        System.out.println("Play softly");
    }

    @Override
    public void visit(Guitar guitar) {
        System.out.println("Play sequences");
    }

    @Override
    public void visit(Element element) {

    }
}
