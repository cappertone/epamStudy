package com.epam.autumn.politech.ht10.behavioral.observer;

public class GiveawayRunner {
    public static void main(String[] args) {
        OnlineShop shop = new OnlineShop();

        shop.addObserver(new Subscriber("Bill"));
        shop.setGiveaway(" new prize");
        shop.addObserver(new Subscriber("Tom"));
        shop.setGiveaway("other new prize");


    }
}
