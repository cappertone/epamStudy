package com.epam.autumn.politech.ht3.rockPaperScissorsGame;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Random;
import java.util.Scanner;

import static org.junit.Assert.*;

public class GameLogicTest {

    private GameLogic game = new GameLogic();
    private Options[] options = Options.values();
    private Random random = new Random();
    private Options option = options[random.nextInt(options.length)];
    private Options person = null;
    private String win = "Win";
    private String lose = "Lose";


    @Test
    public void getComputerChoice() {
    }

    @Test
    public void runGame() {

    }
}