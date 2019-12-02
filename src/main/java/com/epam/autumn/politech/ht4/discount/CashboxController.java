package com.epam.autumn.politech.ht4.discount;

class CashboxController {

     double discountCalc(double total) {
         if (total < 500) return 0.05;
         else if (total > 1000) return 0.15;
         else return 0.1;
    }

     double amountCalc(double total) {
        return total - (total * discountCalc(total));
    }

     GenerateReceipt receipt(double total) {
        return new GenerateReceipt(total, discountCalc(total), amountCalc(total));
    }
}
