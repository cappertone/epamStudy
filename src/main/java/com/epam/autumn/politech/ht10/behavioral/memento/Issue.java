package com.epam.autumn.politech.ht10.behavioral.memento;

public class Issue {
    private String name;
    private String progress;

    public void set(String name, String status) {
        this.name = name;
        this.progress = status;
    }

    public void loadStatus(Status status) {
        name = status.getIssueName();
        progress = status.getProgress();
    }

    public Status saveIssue() {
        return new Status(name, progress);
    }

    @Override
    public String toString() {
        return "Issue{" +
                "name='" + name + '\'' +
                ", progress='" + progress + '\'' +
                '}';
    }
}

