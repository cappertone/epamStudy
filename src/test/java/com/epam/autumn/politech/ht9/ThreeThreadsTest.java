package com.epam.autumn.politech.ht9;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class ThreeThreadsTest {

    private ByteArrayOutputStream output = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(output));
    }

    @Test
    public void startSelector_True() {
        int [] arr = {1,3,2};
        ThreeThreads threads = new ThreeThreads();
        threads.startSelector(arr);
        assertEquals("firstsecondthird", output.toString());

    }

    @Test
    public void startSelector_WrongData() {
        int[] arr = {1, 2};
        assertEquals("firstthirdsecond", "firstthirdsecond");
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }
}