package com.techelevator.review;

import java.util.Scanner;

public class BinaryConverter {

    public static void main(String[] args) {

        final Scanner userInput = new Scanner(System.in);
        System.out.println("enter space separated decimal values ");
        String input = userInput.nextLine(); // "23 42 56"
        String[] values = input.split(" "); // ["23", "42", "56"]
        for (String value : values) {
            int number = Integer.parseInt(value);
            System.out.println(toBinary(number));
        }
    }

    public static String toBinary(int decimal) {
        int number = decimal;
        String result = "";

        do {
            result = (number % 2) + result; // remainder
            number = number / 2;
        } while (number > 0);

        return result;
    }
}
