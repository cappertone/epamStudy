package com.epam.autumn.politech.ht10.creational.abstractFactory.dakar;

import com.epam.autumn.politech.ht10.creational.abstractFactory.CoDriver;

public class DakarCoDriver implements CoDriver {
    @Override
    public void navigate() {
        System.out.println("Trying not to get lost");
    }
}
