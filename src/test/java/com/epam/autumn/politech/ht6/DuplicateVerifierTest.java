package com.epam.autumn.politech.ht6;

import org.junit.Test;

import static org.junit.Assert.*;

public class DuplicateVerifierTest {
    private DuplicateVerifier duplicateVerifier = new DuplicateVerifier();


    @Test
    public void duplicateChecker_true() {
        Integer[] arr = {1, 2, 3, 1};
        assertTrue(duplicateVerifier.duplicateChecker(arr));
    }

    @Test
    public void duplicateChecker_false() {
        Integer[] arr = {1, 2, 3, 4};
        assertFalse(duplicateVerifier.duplicateChecker(arr));

    }
}