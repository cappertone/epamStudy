package com.epam.autumn.politech.ht4.discount;

import java.util.Scanner;

public class AppView {
    private CashboxController controller = new CashboxController();

    String runCashBox() {
        try (Scanner sc = new Scanner(System.in)) {
            double total;
            do {
                System.out.println("Please enter a total check");
                while (!sc.hasNextInt()) {
                    System.out.println("That's not a number!");
                    sc.next();
                }
                total = sc.nextDouble();
            } while (total <= 0);
            return controller.receipt(total).toString();
        }
    }
}
