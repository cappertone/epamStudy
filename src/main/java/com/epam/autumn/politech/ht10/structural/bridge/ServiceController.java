package com.epam.autumn.politech.ht10.structural.bridge;

public class ServiceController {
    public static void main(String[] args) {
        CloudService [] services = {
               new AsureService(new Blogger()),
               new IBMService(new BrandAccount())
        };
        for (CloudService service: services) {
            service.saveContent();
        }
    }
}
