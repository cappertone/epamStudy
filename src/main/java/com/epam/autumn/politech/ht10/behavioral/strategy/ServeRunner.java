package com.epam.autumn.politech.ht10.behavioral.strategy;

public class ServeRunner {
    public static void main(String[] args) {
        Soldier soldier = new Soldier();
        soldier.setStrategy(new NewbieServe());
        soldier.executeStrategy();
        soldier.setStrategy(new CorporalServe());
        soldier.executeStrategy();
    }
}
