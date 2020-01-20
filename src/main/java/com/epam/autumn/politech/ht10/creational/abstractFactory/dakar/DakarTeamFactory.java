package com.epam.autumn.politech.ht10.creational.abstractFactory.dakar;

import com.epam.autumn.politech.ht10.creational.abstractFactory.CoDriver;
import com.epam.autumn.politech.ht10.creational.abstractFactory.Driver;
import com.epam.autumn.politech.ht10.creational.abstractFactory.Mechanic;
import com.epam.autumn.politech.ht10.creational.abstractFactory.RaceTeamFactory;

public class DakarTeamFactory implements RaceTeamFactory {
    @Override
    public Driver getDriver() {
        return new DakarDriver();
    }

    @Override
    public CoDriver getCoDriver() {
        return new DakarCoDriver();
    }

    @Override
    public Mechanic getMechanic() {
        return new DakarMechanic();
    }
}
