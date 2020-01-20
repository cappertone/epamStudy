package com.epam.autumn.politech.ht10.behavioral.chain;

public class SecretQuizRecovery extends AccountRecovery {
    public SecretQuizRecovery(int priority) {
        super(priority);
    }

    @Override
    public void write() {
        System.out.println("Ask secret question");
    }
}
