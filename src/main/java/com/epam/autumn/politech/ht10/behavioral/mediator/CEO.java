package com.epam.autumn.politech.ht10.behavioral.mediator;

public class CEO extends Employee {
    public CEO(TeamMeeting meeting, String name, int priority) {
        super(meeting, name, priority);
    }

    @Override
    public void joinMeeting(TeamMeeting meeting) {
        System.out.println("PM " + getName() + " joined meeting");
    }}
