package com.techelevator.guessgame;

import java.util.Scanner;

public class UserInterface {

    final Scanner userInput = new Scanner(System.in);

    public int getGuess() {
        System.out.println("Guess a number between 1 and 100");
        String guessAsString = userInput.nextLine();
        int guess = Integer.parseInt(guessAsString);
        return guess;
    }

    public void reportResult(GameLogic.GuessResult result) {
        switch (result) {
            case CORRECT:
                System.out.println("CORRECT!!");
                break;
            case TOOLOW:
                System.out.println("higher");
                break;
            case TOOHIGH:
                System.out.println("lower");
                break;
        }
    }



}
