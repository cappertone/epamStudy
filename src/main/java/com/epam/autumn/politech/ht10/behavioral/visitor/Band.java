package com.epam.autumn.politech.ht10.behavioral.visitor;

public class Band implements Element {
    Element[] elements;

    public Band(){
        this.elements = new Element[]{
                new Drums(),
                new Bass(),
                new Guitar()
        };
    }
    @Override
    public void accept(Visitor visitor) {
        for(Element el : elements){
            el.accept(visitor);
        }
        visitor.visit(this);
    }
}
