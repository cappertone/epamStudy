package com.epam.autumn.politech.HT1;

import java.util.Scanner;

public class GuessingGame {
    private static int count = 0;
    private static final int RANDOMNUMBER = 1 + (int)(Math.random() * 1000.0D);
    private static boolean guessed = false;


    public static void main(String[] args) {
        System.out.println("Input number from 1 to 1000");
        Scanner sc = new Scanner(System.in);
        System.out.println(RANDOMNUMBER);
        doGame(sc);
        sc.close();
    }

    private static void doGame(Scanner sc) {
        while(!guessed) {
            if(sc.hasNextInt()) {
                int number = sc.nextInt();
                if (number >= 1 && number <= 1000) {
                    System.out.println(compare(number));
                } else {
                    System.out.println("inputData out of range");
                }
            }else if (!sc.hasNextInt()){
                System.out.println("wrong inputData");
                break;
            }
        }
    }

    private static String compare(int number) {
        ++count;
        return number < RANDOMNUMBER ? "Too Low" : (number == RANDOMNUMBER ? win() : "Too High");
    }

    private static String win(){
        guessed = true;
        return String.format("win with the %s attempt, guessed number is %s", count, RANDOMNUMBER);
    }

}
