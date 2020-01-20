package com.epam.autumn.politech.ht10.structural.flyweight;

public class EmailMessage implements Message {
    @Override
    public void send() {
        System.out.println("Sending email message");
    }
}
