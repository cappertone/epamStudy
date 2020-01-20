package com.epam.autumn.politech.ht10.creational.builder;

public abstract class EngineBuilder {
    Engine engine;

    void createEngine(){
        engine = new Engine();
    }

    abstract void buildCapacity();
    abstract void buildFuel();
    abstract void buildPower();

    Engine getEngine(){
        return engine;
    }

}
