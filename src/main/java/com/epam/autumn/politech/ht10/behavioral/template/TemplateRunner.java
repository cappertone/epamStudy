package com.epam.autumn.politech.ht10.behavioral.template;

public class TemplateRunner {
    public static void main(String[] args) {
        Account buyer = new Buyer();
        Account seller = new Seller();

        seller.makeDeal();
        buyer.makeDeal();
        seller.getFromWarehouse();
        seller.getReport();
        buyer.getReport();
    }
}
