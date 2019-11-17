package com.epam.autumn.politech.HT2;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task4Test {

    @Test
    public void increment() {
        Task4 incrementor = new Task4();
        int[] arr1 = {1,2,3};
        int[] arr1out = {1,2,4};
        int[] arr2 = {4,3,2,1};
        int[] arr2out = {4,3,2,2};
        int[] arr3 = {9,9};
        int[] arr3out = {1,0,0};

        assertArrayEquals(incrementor.increment(arr1),arr1out);
        assertArrayEquals(incrementor.increment(arr2),arr2out);
        assertArrayEquals(incrementor.increment(arr3),arr3out);


    }
}