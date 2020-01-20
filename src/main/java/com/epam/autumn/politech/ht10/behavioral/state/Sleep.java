package com.epam.autumn.politech.ht10.behavioral.state;

public class Sleep implements Activity {
    @Override
    public void doServe(Soldier context) {
        System.out.println("Sleeping");
        context.setActivity(new Eat());
    }
}
