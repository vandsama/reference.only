package com.techelevator.exceptions;

import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        try {
            int guess = getInputFromUser();
            System.out.println("the guess was :" + guess);
        } catch (NumberFormatException nfe) {
            System.out.println("please enter a number");
        } catch (RuntimeException nfe) {
            System.out.println("please enter a number");
        } catch (Exception e) {
            System.out.println("this can't happen");
        } finally {
            System.out.println("thanks for playing");
        }

    }

    private static int getInputFromUser() {
        final Scanner userInput = new Scanner(System.in);
        System.out.println("enter a number between 0 and 99");
        String guessInput = userInput.nextLine();

        if (guessInput.isBlank()) {

        }

        int guess = Integer.parseInt(guessInput);
        return guess;
    }
 }
