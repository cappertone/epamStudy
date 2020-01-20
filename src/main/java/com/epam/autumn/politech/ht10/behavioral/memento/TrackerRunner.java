package com.epam.autumn.politech.ht10.behavioral.memento;

public class TrackerRunner {
    public static void main(String[] args) {
        Issue issue = new Issue();
        issue.set("Fix someBug", "New");
        System.out.println(issue);
        BugTracker tracker = new BugTracker();
        issue.set("Fix someBug", "Fix bug, Send to test");
        System.out.println(issue);
        tracker.setStatus(issue.saveIssue());
        issue.set("Fix someBug", "Retest");
        System.out.println(issue);
        issue.loadStatus(tracker.getStatus());
        System.out.println(issue);
    }
}
