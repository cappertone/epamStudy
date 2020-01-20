package com.epam.autumn.politech.ht10.behavioral.strategy;

public class Soldier {
    ServeStrategy strategy;
    public void setStrategy(ServeStrategy strategy){
        this.strategy = strategy;
    }
    public void executeStrategy(){
        strategy.serve();
    }
}
