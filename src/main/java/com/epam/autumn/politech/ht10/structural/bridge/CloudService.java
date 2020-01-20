package com.epam.autumn.politech.ht10.structural.bridge;

public abstract class CloudService {
    public Account account;

    public CloudService(Account account) {
        this.account = account;
    }

    public abstract void saveContent();
}
