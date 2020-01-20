package com.epam.autumn.politech.ht10.structural.decorator;

public class DogDemo {
    public static void main(String[] args) {
        DogInterface dog = new PoliceDogDecorator(new GuideDogDecorator(new GuardDogDecorator(
                new ServiceDog("serve the human"))));
        dog.serve();
    }
}
