package com.epam.autumn.politech.ht10.structural.decorator;

public abstract class Decorator implements DogInterface {
    DogInterface dogAbility;

    public Decorator(DogInterface dogAbility) {
        this.dogAbility = dogAbility;
    }
}
