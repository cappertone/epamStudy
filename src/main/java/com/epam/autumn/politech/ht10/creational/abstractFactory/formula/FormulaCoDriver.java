package com.epam.autumn.politech.ht10.creational.abstractFactory.formula;

import com.epam.autumn.politech.ht10.creational.abstractFactory.CoDriver;

public class FormulaCoDriver implements CoDriver {
    @Override
    public void navigate() {
        System.out.println("Track circle time");
    }
}
