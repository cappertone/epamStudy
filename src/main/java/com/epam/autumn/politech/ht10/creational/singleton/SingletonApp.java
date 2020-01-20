package com.epam.autumn.politech.ht10.creational.singleton;

public class SingletonApp {
    public static void main(String[] args) {
           Singleton first = Singleton.getInstance();
           Singleton second = Singleton.getInstance();
        System.out.println(first.equals(second));
    }
}
