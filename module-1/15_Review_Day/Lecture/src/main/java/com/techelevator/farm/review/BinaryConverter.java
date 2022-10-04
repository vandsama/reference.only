package com.techelevator.farm.review;

import java.util.Scanner;

public class BinaryConverter {

    public static void main(String[] args) {

        final Scanner userInput = new Scanner(System.in);
        System.out.println("enter space separated decimal value ");
        String input = userInput.nextLine();
        String[] values = input.split(" ");
        for (String value : values){
            int number = Integer.parseInt(value);
            System.out.println(toBinary(number));
        }
    }

    public static String toBinary(int decimal) {
        int number = decimal;
        String result = "";

        do {
            result = (number % 2) + result; //remainder
            number = number / 2;
        } while (number > 0);

        return result;
    }
}
