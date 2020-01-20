package com.epam.autumn.politech.ht10.behavioral.mediator;

public class MeetingRunner {
    public static void main(String[] args) {
        GlobalTeamMeeting teamMeeting = new GlobalTeamMeeting(2);
        Employee Ceo = new CEO(teamMeeting, "Bob", 5);
        Employee PM = new ProjectManager(teamMeeting, "Alice", 4);
        Employee seniorDev = new Developer(teamMeeting, "Mike", 3);
        Employee JuniorDev = new Developer(teamMeeting, "Paul", 0);

        teamMeeting.setAdmin(Ceo);
        teamMeeting.addUser(PM);
        teamMeeting.addUser(seniorDev);
        teamMeeting.addUser(JuniorDev);

        Ceo.createMeeting(teamMeeting);
    }

}
