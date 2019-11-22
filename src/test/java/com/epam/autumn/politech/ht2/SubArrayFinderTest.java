package com.epam.autumn.politech.ht2;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SubArrayFinderTest {
    private SubArrayFinder targetSubarray = new SubArrayFinder();
    private int[] arr;
    private int target;
    private int[] arrOut;

    @Test
    public void findSumSubarray_true() {
        arr = new int[]{2, 7, 11, 15};
        target = 9;
        arrOut = new int[]{0, 1};
        assertArrayEquals(targetSubarray.findSumSubarray(arr, target), arrOut);
    }

    @Test
    public void findSumSubarray_NonSubArray() {
        arr = new int[]{2, 7, 11, 15};
        target = 5;
        arrOut = new int[]{};
        assertArrayEquals(targetSubarray.findSumSubarray(arr, target), arrOut);
    }

    @Test
    public void findSumSubarray_empty() {
        arr = new int[]{};
        target = 0;
        arrOut = new int[]{};
        assertArrayEquals(targetSubarray.findSumSubarray(arr, target), arrOut);
    }

    @Test(expected = NullPointerException.class)
    public void findSumSubarray_NPE() {
        target = 1;
        fail(Arrays.toString(targetSubarray.findSumSubarray(null, target)));
    }
}