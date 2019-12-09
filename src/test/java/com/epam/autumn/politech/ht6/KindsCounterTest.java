package com.epam.autumn.politech.ht6;

import org.junit.Test;

import static org.junit.Assert.*;

public class KindsCounterTest {
    private KindsCounter kindsCounter = new KindsCounter();

    @Test
    public void candiesSharing() {
        Integer[] arr = {1, 1, 2, 2, 3, 3};
        assertEquals(3, kindsCounter.candiesSharing(arr));
    }

    @Test
    public void candiesSharing2() {
        Integer[] arr = {1, 1, 2, 3};
        assertEquals(2, kindsCounter.candiesSharing(arr));
    }
}