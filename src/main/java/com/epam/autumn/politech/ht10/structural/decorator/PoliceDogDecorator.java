package com.epam.autumn.politech.ht10.structural.decorator;

public class PoliceDogDecorator extends Decorator {
    public PoliceDogDecorator(DogInterface dogAbility) {
        super(dogAbility);
    }
    @Override
    public void serve() {
        dogAbility.serve();
        System.out.println("Attack");
    }
}
