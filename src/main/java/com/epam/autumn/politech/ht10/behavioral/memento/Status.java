package com.epam.autumn.politech.ht10.behavioral.memento;

public class Status {
    private final String issueName;
    private final String progress;

    public Status(String issueName, String status) {
        this.issueName = issueName;
        this.progress = status;
    }
    public String getIssueName() {return issueName;}
    public String getProgress() {return progress;}
}
