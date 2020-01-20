package com.epam.autumn.politech.ht10.behavioral.observer;

public class Subscriber implements Observer {
    private String name;

    public String getName() {
        return name;
    }

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(String message) {
        System.out.println(this.getName()+"! We make new giveaway: " + message);
    }
}
