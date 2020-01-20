package com.epam.autumn.politech.ht10.behavioral.template;

public class Seller extends Account {
    @Override
    void makeDeal() {
        System.out.println("Get money from buyer");
    }

    @Override
    void getFromWarehouse() {
    }
}
