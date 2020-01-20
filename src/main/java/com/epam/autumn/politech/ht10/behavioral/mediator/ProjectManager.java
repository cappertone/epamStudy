package com.epam.autumn.politech.ht10.behavioral.mediator;

public class ProjectManager extends Employee {
    public ProjectManager(TeamMeeting meeting, String name, int priority) {
        super(meeting, name, priority);
    }

    @Override
    public void joinMeeting(TeamMeeting meeting) {
        System.out.println("PM " + getName() + " joined meeting");
    }

}
