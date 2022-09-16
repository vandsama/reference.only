package com.techelevator;

import java.util.Scanner;

class DiscountCalculator {

    /**
     * The main method is the start and end of our program
     */
    public static void main(String[] args) {

        final Scanner userInput = new Scanner(System.in);

        System.out.println("Welcome to the Discount Calculator");

        // Prompt the user for a discount amount
        // The answer needs to be saved as a double
        System.out.print("Enter the discount amount (w/out percentage): ");
        String discountAsString = userInput.nextLine();
        double discount = Double.parseDouble(discountAsString) / 100.0;

        // Prompt the user for a series of prices
        System.out.print("Please provide a series of prices (space separated): ");
        String priceInput = userInput.nextLine();  // "1.99 2.39 3,99"
        String[] pricesAsString = priceInput.split(" ");

        for (int index = 0; index < pricesAsString.length; index++) {
            double originalPrice = Double.parseDouble(pricesAsString[index]);
            double discountedPrice = originalPrice * (1-discount);

            System.out.println(String.format("$%10.2f discounted to $%5.2f", originalPrice, discountedPrice));
        }

    }

}
