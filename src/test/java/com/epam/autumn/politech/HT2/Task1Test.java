package com.epam.autumn.politech.HT2;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task1Test {

    @Test
    public void maxSubArraySumKagane() {
        Task1 maxSubSum = new Task1();
        int[] arr1 = {-2,1,-3,4,-1,2,1,-5,4};
        int out1 = 6;
        int[] arr2 = {};
        int out2 = 0;
        int[] arr3 = {-5,-6,-15,-35};
        int out3 = -5;

        assertEquals(maxSubSum.maxSubArraySumKagane(arr1),out1);
        assertEquals(maxSubSum.maxSubArraySumKagane(arr2),out2);
        assertEquals(maxSubSum.maxSubArraySumKagane(arr3),out3);


    }

    @Test
    public void maxSubArraySum() {
        Task1 maxSubSum = new Task1();
        int[] arr1 = {-2,1,-3,4,-1,2,1,-5,4};
        int out1 = 6;
        int[] arr2 = {};
        int out2 = 0;
        int[] arr3 = {-5,-6,-15,-35};
        int out3 = -5;

        assertEquals(maxSubSum.maxSubArraySum(arr1,0,arr1.length-1),out1);
        assertEquals(maxSubSum.maxSubArraySum(arr2,0,arr2.length-1),out2);
        assertEquals(maxSubSum.maxSubArraySum(arr3,0,arr3.length-1),out3);
    }
}