package com.epam.autumn.politech.ht10.behavioral.template;

public abstract class Account {
    String name;
    int money;

    void showAccountAttributes(){
        System.out.println("Account name, ");
    }

    void getReport(){
        System.out.println("Sending deal report to "+ this.getClass().getSimpleName());
    }

    abstract void makeDeal();
    abstract void getFromWarehouse();
}
