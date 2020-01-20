package com.epam.autumn.politech.ht10.behavioral.state;

public class Eat implements Activity {
    int count = 0;
    @Override
    public void doServe(Soldier context) {
        if(count<3){
            System.out.println("have a lunch");
            count++;
        }else{
            context.setActivity(new Guard());
        }
    }
}
