package com.techelevator;

import java.util.Scanner;

public class SimpleCLI {
    public static void main(String[] args) {
        // get input from user
        final Scanner userInput = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = userInput.nextLine();

        // do something useful (hopefully)
        String greeting = "hello " + name;

        // return some response
        System.out.println(greeting);
    }



}
