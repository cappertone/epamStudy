package com.epam.autumn.politech.ht10.creational.abstractFactory.formula;

import com.epam.autumn.politech.ht10.creational.abstractFactory.CoDriver;
import com.epam.autumn.politech.ht10.creational.abstractFactory.Driver;
import com.epam.autumn.politech.ht10.creational.abstractFactory.Mechanic;
import com.epam.autumn.politech.ht10.creational.abstractFactory.RaceTeamFactory;

public class FormulaTeamFactory implements RaceTeamFactory {
    @Override
    public Driver getDriver() {
        return new FormulaDriver();
    }

    @Override
    public CoDriver getCoDriver() {
        return new FormulaCoDriver();
    }

    @Override
    public Mechanic getMechanic() {
        return new FormulaMechanic();
    }
}
