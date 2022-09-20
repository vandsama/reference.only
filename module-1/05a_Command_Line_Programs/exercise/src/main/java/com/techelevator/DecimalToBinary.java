package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter in a series of decimal values (separated by spaces): ");
		String valuesInput = input.nextLine();
		String[] valuesInputAsString = valuesInput.split(" ");

		//System.out.println(originalPrice + " discounted to " + discountedPrice);

		//System.out.println(originalValue);

		String binaryValue = "";
		for (int index = 0; index < valuesInputAsString.length; index++){
			int originalValue = Integer.parseInt(valuesInputAsString[index]);

			for(int i = originalValue; i >= 0; i/=2) {
				binaryValue = i % 2 + (binaryValue);
				if (i == 0) {
					break;
				}
			}

		}
		System.out.println(binaryValue);
	}

}
