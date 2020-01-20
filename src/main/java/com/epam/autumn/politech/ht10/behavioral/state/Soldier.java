package com.epam.autumn.politech.ht10.behavioral.state;

public class Soldier {
    private Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }
    public void doServe(){
        activity.doServe(this);
    }
}
