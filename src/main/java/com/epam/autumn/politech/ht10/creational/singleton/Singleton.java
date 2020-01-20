package com.epam.autumn.politech.ht10.creational.singleton;

public class Singleton {
    private static volatile Singleton instance;
    private static int counter = 0;

    private Singleton() {
        counter++;
    }


    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    static int getCounter() {
        return counter;
    }

}
