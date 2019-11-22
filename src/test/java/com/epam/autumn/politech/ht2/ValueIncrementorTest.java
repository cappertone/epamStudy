package com.epam.autumn.politech.ht2;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ValueIncrementorTest {
    private ValueIncrementor incrementor = new ValueIncrementor();
    private int[] arr;
    private int[] arrOut;

    @Test
    public void increment_Test_sameSize() {
        arr = new int[]{4, 3, 2, 0};
        arrOut = new int[]{4, 3, 2, 1};
        assertArrayEquals(incrementor.increment(arr), arrOut);
    }

    @Test
    public void increment_Test_newSize() {
        arr = new int[]{9, 9, 9, 9};
        arrOut = new int[]{1, 0, 0, 0, 0};
        assertArrayEquals(incrementor.increment(arr), arrOut);
    }

    @Test()
    public void containDuplicate_Test_OutOfBounds() {
        arr = new int[]{};
        arrOut = new int[]{1};
        assertArrayEquals(incrementor.increment(arr), arrOut);
    }

    @Test(expected = NullPointerException.class)
    public void increment_Test_NPE() {
        fail(Arrays.toString(incrementor.increment(null)));
    }
}