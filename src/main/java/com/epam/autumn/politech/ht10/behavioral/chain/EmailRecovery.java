package com.epam.autumn.politech.ht10.behavioral.chain;

public class EmailRecovery extends AccountRecovery {
    public EmailRecovery(int priority) {
        super(priority);
    }

    @Override
    public void write() {
        System.out.println("Send verification email");
    }
}
