package com.epam.autumn.politech.ht10.creational.factory;

public class OriginalCharger implements Charger {
    @Override
    public String charge() {
        double voltage = 5.0d;
        double amperage = 2.0d;
        return "charging with " + voltage + "V and " + amperage + "A";
    }
}
