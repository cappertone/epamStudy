package com.epam.autumn.politech.ht10.structural.facade;

public class DataCollector {
    public void run() {
        DataController controller = new DataController();
        DBConnector dbConnector = new DBConnector();
        RepositoryService service = new RepositoryService();
        controller.getData();
        dbConnector.connectToDB();
        controller.saveData();
        service.saveDataToDB(dbConnector);
        dbConnector.closeConnection();
    }
}
