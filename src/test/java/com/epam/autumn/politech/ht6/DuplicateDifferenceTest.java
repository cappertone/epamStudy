package com.epam.autumn.politech.ht6;

import org.junit.Test;

import static org.junit.Assert.*;

public class DuplicateDifferenceTest {
    private DuplicateDifference dupDifference = new DuplicateDifference();

    @Test
    public void duplicateDistance_true() {
        int[] arr = {1, 2, 3, 1};
        int key = 3;
        assertTrue(dupDifference.duplicateDistance(arr, key));
    }

    @Test
    public void duplicateDistance_false() {
        int[] arr = {1, 2, 3, 1, 2, 3};
        int key = 2;
        assertFalse(dupDifference.duplicateDistance(arr, key));

    }
}

