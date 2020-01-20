package com.epam.autumn.politech.ht10.behavioral.template;

public class Buyer extends Account {
    @Override
    void makeDeal() {
        System.out.println("Send money to seller");
    }

    @Override
    void getFromWarehouse() {
        System.out.println("Get product from warehouse");
    }
}
