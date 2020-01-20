package com.epam.autumn.politech.ht10.creational.builder;

public class TruckEngineBuilder extends EngineBuilder {
    @Override
    void buildCapacity() {
        engine.setCapacity(6000);
    }

    @Override
    void buildFuel() {
        engine.setFuel(Fuel.DIESEL);
    }

    @Override
    void buildPower() {
        engine.setPower(500);
    }
}
