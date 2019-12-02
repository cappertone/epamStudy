package com.epam.autumn.politech.ht5.duplicatorRemover2ndRound;

import com.epam.autumn.politech.ht5.DupRemover;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class DupRemoverTest {
    DupRemover dupRemover = new DupRemover();
    ByteArrayOutputStream output = new ByteArrayOutputStream();

    int[] arr1 = {1, 1, 2};
    int[] arr2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
    int[] expected1 = {1, 2};
    String expected2 = "0 1 2 3 4 ";

    @Test
    public void removeDuplicates() {
        assertEquals(2, dupRemover.removeDuplicates(arr1));
    }


    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(output));
    }

    @Test
    public void printresult() {

        dupRemover.printresult(arr2, 5);
        assertEquals(expected2, output.toString());

    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

}