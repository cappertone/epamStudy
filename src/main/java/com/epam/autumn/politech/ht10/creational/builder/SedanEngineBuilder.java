package com.epam.autumn.politech.ht10.creational.builder;

public class SedanEngineBuilder extends EngineBuilder {
    @Override
    void buildCapacity() {
        engine.setCapacity(2200);
    }

    @Override
    void buildFuel() {
    engine.setFuel(Fuel.GAS);
    }

    @Override
    void buildPower() {
    engine.setPower(180);
    }
}
