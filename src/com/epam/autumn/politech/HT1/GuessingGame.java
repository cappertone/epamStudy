package com.epam.autumn.politech.HT1;

import java.util.Scanner;

public class GuessingGame {
    private static int count = 0;
    private static final int RANDOMNUMBER = 1 + (int)(Math.random() * 1000.0D);

    public GuessingGame() {
    }

    public static void main(String[] args) {
        System.out.println("Input number from 1 to 1000");
        Scanner sc = new Scanner(System.in);

        while(true) {
            while(sc.hasNextInt()) {
                int number = sc.nextInt();
                if (number >= 1 && number <= 1000) {
                    System.out.println(compare(number));
                } else {
                    System.out.println("inputData out of range");
                }
            }

            sc.close();
            return;
        }
    }

    private static String compare(int number) {
        ++count;
        String win = String.format("win with the %s attempt, guessed number is %s", count, RANDOMNUMBER);
        return number < RANDOMNUMBER ? "Too Low" : (number == RANDOMNUMBER ? win : "Too High");
    }
}
