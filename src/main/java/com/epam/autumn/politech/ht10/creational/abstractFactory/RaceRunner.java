package com.epam.autumn.politech.ht10.creational.abstractFactory;

import com.epam.autumn.politech.ht10.creational.abstractFactory.dakar.DakarTeamFactory;
import com.epam.autumn.politech.ht10.creational.abstractFactory.formula.FormulaTeamFactory;

public class RaceRunner {
    public static void main(String[] args) {
        RaceTeamFactory teamFactory = new DakarTeamFactory();
        Driver dakardriver = teamFactory.getDriver();
        CoDriver coDriver = teamFactory.getCoDriver();
        Mechanic mechanic = teamFactory.getMechanic();
        dakardriver.drive();
        coDriver.navigate();
        mechanic.repair();
    }
}

