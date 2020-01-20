package com.epam.autumn.politech.ht10.structural.bridge;

public class IBMService extends CloudService {
    public IBMService(Account account) {
        super(account);
    }

    @Override
    public void saveContent() {
        account.generateContent();
        System.out.println("save to IBM cloud");
    }
}
