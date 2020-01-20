package com.epam.autumn.politech.ht10.creational.abstractFactory;

public interface RaceTeamFactory {
    Driver getDriver();
    CoDriver getCoDriver();
    Mechanic getMechanic();
}
