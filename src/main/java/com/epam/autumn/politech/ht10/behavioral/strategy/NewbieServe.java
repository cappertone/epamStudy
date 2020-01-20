package com.epam.autumn.politech.ht10.behavioral.strategy;

public class NewbieServe implements ServeStrategy {
    @Override
    public void serve() {
        System.out.println("More run, more eat");
    }
}
