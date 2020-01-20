package com.epam.autumn.politech.ht10.structural.composite;

public class LureBag {
    public static void main(String[] args) {
        LurePackage lurePackage = new LurePackage();
        Vobler vobler = new Vobler();
        Vobler vobler1 = new Vobler();
        Twister twister = new Twister();

        lurePackage.addLure(vobler);
        lurePackage.addLure(vobler1);
        lurePackage.addLure(twister);

        lurePackage.createLureBox(lurePackage);
    }
}
