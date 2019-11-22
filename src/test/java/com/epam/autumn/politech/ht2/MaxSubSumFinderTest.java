package com.epam.autumn.politech.ht2;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxSubSumFinderTest {
    private MaxSubSumFinder maxSubSum = new MaxSubSumFinder();
    private int[] arr;
    private int result;

    @Test
    public void maxSubArraySumKagane_Test_positive() {
        arr = new int []{-2,1,-3,4,-1,2,1,-5,4};
        result = 6;
        assertEquals(maxSubSum.maxSubArraySumKagane(arr),result);
    }

    @Test
    public void maxSubArraySumKagane_Test_negative() {
        arr = new int []{-5,-6,-15,-35};
        result= -5;
        assertEquals(maxSubSum.maxSubArraySumKagane(arr),result);
    }

    @Test
    public void maxSubArraySumKagane_Test_empty() {
        arr = new int []{};
        result = 0;
        assertEquals(maxSubSum.maxSubArraySumKagane(arr),result);
    }

    @Test(expected=NullPointerException.class)
    public void maxSubArraySumKagane_Test_NPE() {
        arr = null;
            fail(String.valueOf(maxSubSum.maxSubArraySumKagane(arr)));
    }

    @Test
    public void maxSubArraySum_Test_positive() {
        arr = new int []{-2,1,-3,4,-1,2,1,-5,4};
        result = 6;
        assertEquals(maxSubSum.maxSubArraySum(arr,0,arr.length-1),result);
    }

    @Test
    public void maxSubArraySum_Test_negative() {
        arr = new int []{-5,-6,-15,-35};
        result = -5;
        assertEquals(maxSubSum.maxSubArraySum(arr,0,arr.length-1),result);
    }

    @Test
    public void maxSubArraySum_Test_empty() {
        arr = new int []{};
        result = 0;
        assertEquals(maxSubSum.maxSubArraySum(arr,0,arr.length-1),result);

    }

    @Test(expected=NullPointerException.class)
    public void maxSubArraySum_Test_NPE() {
        arr = null;
        fail(String.valueOf(maxSubSum.maxSubArraySum(arr,0,arr.length-1)));
    }
}