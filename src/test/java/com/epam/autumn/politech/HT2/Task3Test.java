package com.epam.autumn.politech.HT2;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task3Test {

    @Test
    public void findSumSubarray() {
        Task3 targetSubarray = new Task3();
        int[] arr1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] arr1out = {0,1};

        assertArrayEquals(targetSubarray.findSumSubarray(arr1,target1),arr1out);

    }


}