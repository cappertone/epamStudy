package com.epam.autumn.politech.ht10.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class LurePackage {
    private List<Lure> lures = new ArrayList<>();

    public void addLure(Lure lure) {
        lures.add(lure);
    }

    public void remove(Lure lure) {
        lures.remove(lure);
    }

    public void createLureBox(LurePackage lurePackage){
        System.out.println("LurePackage created");
        for (Lure lure: lures) {
            lure.bait();
        }
    }
}
