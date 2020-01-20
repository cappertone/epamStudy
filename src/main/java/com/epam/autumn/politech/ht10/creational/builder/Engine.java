package com.epam.autumn.politech.ht10.creational.builder;

public class Engine {
    private int capacity;
    private Fuel fuel;
    private int power;

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "capacity=" + capacity +
                ", fuel=" + fuel +
                ", power=" + power +
                '}';
    }
}
