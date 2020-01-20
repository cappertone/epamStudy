package com.epam.autumn.politech.ht10.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class OnlineShop implements Observable {
    private String giveaway;
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.handleEvent(giveaway);
        }
    }

    public void setGiveaway(String giveaway) {
        this.giveaway = giveaway;
        notifyObserver();
    }

}
