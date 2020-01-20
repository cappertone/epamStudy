package com.epam.autumn.politech.ht10.behavioral.mediator;

public class Developer extends Employee {

    public Developer(TeamMeeting meeting, String name, int priority) {
        super(meeting, name, priority);
    }

    @Override
    public void joinMeeting(TeamMeeting meeting) {
        System.out.println("Developer " + getName() + " joined meeting");
    }


}
