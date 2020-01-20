package com.epam.autumn.politech.ht10.creational.builder;

public class Director {
    EngineBuilder builder;

    void setEngineBuilder(EngineBuilder builder){
        this.builder = builder;
    }

    Engine buildEngine(){
        builder.createEngine();
        builder.buildCapacity();
        builder.buildFuel();
        builder.buildPower();
        return builder.getEngine();
    }
}
