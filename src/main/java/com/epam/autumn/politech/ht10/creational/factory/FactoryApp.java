package com.epam.autumn.politech.ht10.creational.factory;

import java.util.Arrays;
import java.util.Collection;

public class FactoryApp {

    public static void main(String[] args) {
        ChargeFactory fakeFactory = new FakeChargerFactory();
        ChargeFactory originalFactory = new OriginalChargeFactory();
        Charger original = fakeFactory.create();
        Charger fake = originalFactory.create();

        System.out.println(original.charge());
        System.out.println(fake.charge());

    }

}
