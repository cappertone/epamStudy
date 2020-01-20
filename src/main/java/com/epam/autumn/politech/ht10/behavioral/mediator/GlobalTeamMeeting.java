package com.epam.autumn.politech.ht10.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class GlobalTeamMeeting implements TeamMeeting {
   private int levelAccess;
   private Employee admin;
   private List<Employee> users = new ArrayList<>();

    public GlobalTeamMeeting(int levelAccess) {
        this.levelAccess = levelAccess;
    }

    public void setAdmin(Employee admin) {
        if (admin != null) {
            this.admin = admin;
        } else {
            throw new RuntimeException("Not enough privileges");
        }
    }

    public void addUser(Employee user) {
        if (admin == null) {
            throw new RuntimeException("Not admin in chat");
        }
        int userPriority = user.getPriority();
        if (userPriority<= admin.getPriority() && userPriority >= levelAccess) {
            users.add(user);
        } else {
            System.out.println("you can't add " + user.getName() +". His priority lower than meeting access level");
        }
    }

    @Override
    public void createMeeting(Employee employee, TeamMeeting meeting) {
        for (Employee emp: users) {
            emp.joinMeeting(meeting);
        }
    }
}
