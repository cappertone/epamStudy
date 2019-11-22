package com.epam.autumn.politech.ht3.rockPaperScissorsGame;

import java.util.Random;
import java.util.Scanner;

public class GameLogic {
    private Options person = null;
    private Options[] options = Options.values();
    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);


    public Options getComputerChoice() {
        return options[random.nextInt(options.length)];
    }

    public void runGame() {
        Options computer = getComputerChoice();
        while (person == null) {
            System.out.println("Enter your play: ");
            person = Options.parseType(scanner.next());
            if (person == null) {
                System.out.println("invalid try again");
            }else if (person.equals(computer)) {
                System.out.println("It's a tie!");
            } else if (person.beats(computer)) {
                System.out.println(person + " beats " + computer + " You win!!");
            } else {
                System.out.println(computer + " beats " + person + " You lose!!");
            }
        }
    }
}
