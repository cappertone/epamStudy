package com.epam.autumn.politech.ht3.rockPaperScissorsGame;

import org.junit.Test;

import static org.junit.Assert.*;

public class OptionsTest {
    Options options;

    @Test
    public void beats_Test_true() {
        assertTrue(Options.SCISSORS.beats(Options.PAPER));
    }
    @Test
    public void beats_Test_false() {
        assertFalse(Options.SCISSORS.beats(Options.ROCK));
    }

    @Test
    public void parseType_Test_valid() {
        assertEquals(Options.ROCK, Options.parseType("rock"));
    }
    @Test
    public void parseType_Test_null() {
        assertNull(Options.parseType("foo"));
    }
}