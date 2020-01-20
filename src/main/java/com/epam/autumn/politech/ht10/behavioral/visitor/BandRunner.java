package com.epam.autumn.politech.ht10.behavioral.visitor;

public class BandRunner {
    public static void main(String[] args) {
        Element band = new Band();
        band.accept(new Rockman());
        System.out.println("");
        band.accept(new Jazzmen());
    }
}
