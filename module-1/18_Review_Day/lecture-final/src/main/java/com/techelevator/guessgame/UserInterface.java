package com.techelevator.guessgame;

import java.util.Scanner;

public class UserInterface {

    final private Scanner userInput = new Scanner(System.in);

    public void sayPrompt() {
        System.out.println("Guess a number between 1 and 100");
    }

    public int getGuess() {
        String guessAsString = userInput.nextLine();
        int guess = Integer.parseInt(guessAsString);
        return guess;
    }

    public void reportResult(GameLogic.GuessResult result) {
        switch (result) {
            case CORRECT:
                System.out.println("CORRECT!!"); // interacting with user
                break;
            case TOOLOW:
                System.out.println("higher"); // interacting with user
                break;
            case TOOHIGH:
                System.out.println("lower"); // interacting with user
                break;
        }
    }
}
