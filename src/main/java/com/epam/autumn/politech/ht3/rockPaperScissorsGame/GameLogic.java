package com.epam.autumn.politech.ht3.rockPaperScissorsGame;

import java.util.Random;
import java.util.Scanner;

public class GameLogic {
    private static Options[] options = Options.values();
    private Options person, computer = null;
    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);


    public Options getComputerChoice() {
        return options[random.nextInt(options.length)];
    }
    public Options getPersonChoice(){
        System.out.println("Enter your play: ");
        return Options.parseType(scanner.next());
    }

    public void runGame() {
        while (person == null) {
            computer = getComputerChoice();
            person = getPersonChoice();
            if (person == null) {
                System.out.println("invalid try again");
            }else if (person.equals(computer)) {
                System.out.println("It's a tie!");
            } else if (person.beats(computer)) {
                System.out.println(String.format("%s beats %s You win!!" ,person, computer));
            } else {
                System.out.println(String.format("%s beats %s You win!!" ,computer, person));
            }
        }
        scanner.close();
    }
}
