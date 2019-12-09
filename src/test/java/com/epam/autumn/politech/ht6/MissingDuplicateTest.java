package com.epam.autumn.politech.ht6;

import org.junit.Test;

import static org.junit.Assert.*;

public class MissingDuplicateTest {
    private MissingDuplicate missingDuplicate = new MissingDuplicate();

    @Test
    public void findErrorNums() {
        int[] arr = {1, 2, 2, 4};
        int[] expected = {2, 3};
        assertArrayEquals(expected, missingDuplicate.findErrorNums(arr));
    }

    @Test
    public void findErrorNums_unsorted() {
        int[] arr = {5, 3, 3, 2, 1, 6, 7, 8};
        int[] expected = {3, 4};
        assertArrayEquals(expected, missingDuplicate.findErrorNums(arr));
    }


}