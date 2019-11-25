package com.epam.autumn.politech.ht4.discount;

import java.util.Scanner;

class CashboxController {

     double discountCalc(double total) {
        return total < 500 ? 0.05 : (total > 1000 ? 0.15 : 0.1);
    }

     double amountCalc(double total) {
        return total - (total * discountCalc(total));
    }

     Receipt receipt(double total) {
        return new Receipt(total, discountCalc(total), amountCalc(total));
    }

    String runCashBox() {
        Scanner sc = new Scanner(System.in);
        double total;
        do {
            System.out.println("Please enter a total check");
            while (!sc.hasNextInt()) {
                System.out.println("That's not a number!");
                sc.next();
            }
            total = sc.nextDouble();
        } while (total <= 0);
        return receipt(total).toString();
    }
}
