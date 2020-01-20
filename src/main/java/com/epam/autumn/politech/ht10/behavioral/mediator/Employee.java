package com.epam.autumn.politech.ht10.behavioral.mediator;

public abstract class Employee {
   private TeamMeeting teamMeeting;
   private String name;
   private int priority;


    public Employee(TeamMeeting teamMeeting, String name, int priority) {
        this.teamMeeting = teamMeeting;
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    void createMeeting(TeamMeeting meeting) {
        teamMeeting.createMeeting(this, meeting);
        System.out.println(this.getClass().getSimpleName() + " " + this.getName() + " created meeting");
    }

    abstract void joinMeeting(TeamMeeting meeting);

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", priority=" + priority +
                '}';
    }
}
