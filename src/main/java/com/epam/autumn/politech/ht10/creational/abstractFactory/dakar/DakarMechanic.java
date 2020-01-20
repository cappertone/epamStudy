package com.epam.autumn.politech.ht10.creational.abstractFactory.dakar;

import com.epam.autumn.politech.ht10.creational.abstractFactory.Mechanic;

public class DakarMechanic implements Mechanic {
    @Override
    public void repair() {
        System.out.println("Repair on the go");
    }
}
