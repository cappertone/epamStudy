package com.epam.autumn.politech.ht10.creational.builder;

public class EngineRunner {
    public static void main(String[] args) {
        Director director = new Director();
        director.setEngineBuilder(new TruckEngineBuilder());
        Engine engine = director.buildEngine();
        System.out.println(engine.toString());
    }
}
