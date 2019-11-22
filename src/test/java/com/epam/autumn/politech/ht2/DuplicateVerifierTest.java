package com.epam.autumn.politech.ht2;

import org.junit.Test;

import static org.junit.Assert.*;

public class DuplicateVerifierTest {
    private DuplicateVerifier duplicate = new DuplicateVerifier();
    private int[] arr;

    @Test
    public void containDuplicate_Test_true() {
        arr = new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        assertTrue(duplicate.containDuplicate(arr));
    }
    @Test
    public void containDuplicate_Test_false() {
        DuplicateVerifier duplicate = new DuplicateVerifier();
        arr = new int[]{1, 3, 4, 2, 4};
        assertFalse(duplicate.containDuplicate(arr));
    }
    @Test
    public void containDuplicate_Test_empty() {
        arr = new int[]{};
        assertFalse(duplicate.containDuplicate(arr));
    }

    @Test(expected=NullPointerException.class)
    public void containDuplicate_Test_NPE() {
        fail(String.valueOf(duplicate.containDuplicate(null)));
    }
}