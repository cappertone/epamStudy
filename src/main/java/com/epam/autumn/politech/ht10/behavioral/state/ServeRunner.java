package com.epam.autumn.politech.ht10.behavioral.state;

public class ServeRunner {
    public static void main(String[] args) {
        Soldier soldier = new Soldier();
        soldier.setActivity(new Sleep());
        for (int i = 0; i < 7; i++) {
            soldier.doServe();
        }
    }
}
