package com.epam.autumn.politech.ht10.creational.abstractFactory.formula;

import com.epam.autumn.politech.ht10.creational.abstractFactory.Mechanic;

public class FormulaMechanic implements Mechanic {
    @Override
    public void repair() {
        System.out.println("Repair on pitStop");
    }
}
