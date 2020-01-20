package com.epam.autumn.politech.ht10.creational.abstractFactory.formula;

import com.epam.autumn.politech.ht10.creational.abstractFactory.Driver;

public class FormulaDriver implements Driver {
    @Override
    public void drive() {
        System.out.println("Run as fast as can");
    }
}
