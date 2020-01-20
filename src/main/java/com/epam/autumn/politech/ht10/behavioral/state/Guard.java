package com.epam.autumn.politech.ht10.behavioral.state;

public class Guard implements Activity {
    @Override
    public void doServe(Soldier context) {
        System.out.println("Guard territory");
        context.setActivity(new Sleep());
    }
}
