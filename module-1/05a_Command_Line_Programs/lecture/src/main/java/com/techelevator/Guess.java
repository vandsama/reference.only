package com.techelevator;

import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {

        final Scanner userInput = new Scanner(System.in);
        final int secret = (int) (Math.random() * 100 + 1);

        while (true) {
            System.out.println("Guess a number between 1 and 100");
            String guessAsString = userInput.nextLine();
            int guess = Integer.parseInt(guessAsString);
            if (guess == secret) {
                System.out.println("CORRECT!!");
                break;
            } else if (guess > secret) {
                System.out.println("lower");
            } else {
                System.out.println("higher");
            }
        }

    }
}
