package com.epam.autumn.politech.ht10.behavioral.chain;

public class PhoneRecovery extends AccountRecovery {
    public PhoneRecovery(int priority) {
        super(priority);
    }

    @Override
    public void write() {
        System.out.println("Send SMS");
    }
}
