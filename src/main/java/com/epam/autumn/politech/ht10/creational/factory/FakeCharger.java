package com.epam.autumn.politech.ht10.creational.factory;

public class FakeCharger implements Charger{
    @Override
    public String charge() {
        double voltage = 3.2d;
        double amperage = 0.03d;
        return "charging with " + voltage + "V and " + amperage + "A";
    }
}
