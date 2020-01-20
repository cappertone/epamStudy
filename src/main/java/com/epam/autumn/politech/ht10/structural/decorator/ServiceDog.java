package com.epam.autumn.politech.ht10.structural.decorator;

public class ServiceDog implements DogInterface {
    String skill;
    public ServiceDog(String skill) {
        this.skill = skill;
    }
    @Override
    public void serve() {
        System.out.println(skill);
    }
}
