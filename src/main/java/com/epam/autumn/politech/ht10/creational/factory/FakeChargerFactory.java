package com.epam.autumn.politech.ht10.creational.factory;

public class FakeChargerFactory implements ChargeFactory {
    @Override
    public Charger create() {
        return new FakeCharger();
    }
}
