package com.epam.autumn.politech.ht10.structural.decorator;

public class GuideDogDecorator extends Decorator {
    public GuideDogDecorator(DogInterface dogAbility) {
        super(dogAbility);
    }

    @Override
    public void serve() {
        dogAbility.serve();
        System.out.println("Help the blind");
    }
}
