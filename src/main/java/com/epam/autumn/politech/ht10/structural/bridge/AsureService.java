package com.epam.autumn.politech.ht10.structural.bridge;

public class AsureService extends CloudService {

    public AsureService(Account account) {
        super(account);
    }

    @Override
    public void saveContent() {
        account.generateContent();
        System.out.println("saving to AWS cloud");
    }
}
