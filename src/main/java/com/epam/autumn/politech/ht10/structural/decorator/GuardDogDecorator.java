package com.epam.autumn.politech.ht10.structural.decorator;

public class GuardDogDecorator extends Decorator {
    public GuardDogDecorator(DogInterface dogAbility) {
        super(dogAbility);
    }

    @Override
    public void serve() {
        dogAbility.serve();
        System.out.println("Guard the home");
    }
}
