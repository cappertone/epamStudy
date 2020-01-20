package com.epam.autumn.politech.ht10.creational.abstractFactory.dakar;

import com.epam.autumn.politech.ht10.creational.abstractFactory.Driver;

public class DakarDriver implements Driver {
    @Override
    public void drive() {
        System.out.println("Drive neatly through the desert");
    }
}
