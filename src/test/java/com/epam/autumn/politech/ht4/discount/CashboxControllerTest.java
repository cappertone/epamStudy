package com.epam.autumn.politech.ht4.discount;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashboxControllerTest {
    private CashboxController cashboxController = new CashboxController();
    private static final double DELTA = 1e-15;
    private GenerateReceipt generateReceipt = new GenerateReceipt(100d, 0.05, 95.0);

    @Test
    public void receipt() {
        assertEquals(generateReceipt.toString(), cashboxController.receipt(100).toString());
    }

    @Test
    public void discountCalc() {
        assertEquals(cashboxController.discountCalc(600d), 0.1d, DELTA);
    }

    @Test
    public void amountCalc() {
        assertEquals(cashboxController.amountCalc(1500d), 1275d, DELTA);
    }
}