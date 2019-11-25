package com.epam.autumn.politech.ht4.discount;

import com.epam.autumn.politech.ht3.rockPaperScissorsGame.Options;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Date;
import java.util.Scanner;

import static org.junit.Assert.*;

public class CashboxControllerTest {
    private CashboxController cashboxController = new CashboxController();
    private static final double DELTA = 1e-15;
    private Receipt receipt = new Receipt(100d, 0.05, 95.0);

    @Test
    public void receipt() {
        assertEquals(receipt.toString(), cashboxController.receipt(100).toString());
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