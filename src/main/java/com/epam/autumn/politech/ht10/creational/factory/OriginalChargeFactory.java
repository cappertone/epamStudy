package com.epam.autumn.politech.ht10.creational.factory;

public class OriginalChargeFactory implements ChargeFactory {
    @Override
    public Charger create() {
        return new OriginalCharger();
    }
}
