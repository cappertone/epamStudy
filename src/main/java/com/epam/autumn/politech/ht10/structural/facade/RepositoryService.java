package com.epam.autumn.politech.ht10.structural.facade;

public class RepositoryService {
    void saveDataToDB(DBConnector connector){
        if(connector.isConnection()){
            System.out.println("Data saveed");
        }else{
            System.out.println("Connection closed, reopen to save data");
        }
    }
}
