package com.epam.autumn.politech.HT2;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task5Test {

    @Test
    public void containDuplicate() {
        Task5 duplicate = new Task5();
        int[] arr1 = {1, 2, 3, 1};
        int[] arr2 = {1, 2, 3, 4};
        int[] arr3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        assertTrue(duplicate.containDuplicate(arr1));
        assertFalse(duplicate.containDuplicate(arr2));
        assertTrue(duplicate.containDuplicate(arr3));


    }
}