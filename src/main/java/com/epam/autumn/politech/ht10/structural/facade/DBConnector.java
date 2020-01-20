package com.epam.autumn.politech.ht10.structural.facade;

public class DBConnector {
   private boolean connection;

    public boolean isConnection() {
        return connection;
    }

    void connectToDB(){
        connection = true;
        System.out.println("Connection is open");
    }
    void closeConnection(){
        connection = false;
        System.out.println("Connection closed");
    }
}
