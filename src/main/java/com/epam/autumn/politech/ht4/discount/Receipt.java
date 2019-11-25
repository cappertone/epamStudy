package com.epam.autumn.politech.ht4.discount;

import java.text.DecimalFormat;
import java.util.Date;
import java.util.Objects;

public class Receipt {
    private Date date = new Date();
    private double total;
    private double discount;
    private double amountToPay;

    Receipt(double total, double discount, double amountToPay) {
        this.total = total;
        this.discount = discount;
        this.amountToPay = amountToPay;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#%");
        return   date +
                ",\n total=" + total +
                ",\n discount=" + df.format(discount) +
                ",\n amountToPay=" + amountToPay;
    }
}
