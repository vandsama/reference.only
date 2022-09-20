package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the length: ");
		String lengthValueInputAsString = input.nextLine();
		int lengthValueInput = Integer.parseInt(lengthValueInputAsString);

		System.out.print("Is the measurement in (m)eter, or (f)eet? ");
		String lengthUnitTypeInput = input.nextLine();

		if(lengthUnitTypeInput == "m") {
			int lengthFeet = (int) (lengthValueInput * 3.2808399);
			System.out.println(lengthValueInput + lengthUnitTypeInput + " is " + lengthFeet + "f.");
		}

		else {
			int lengthMeters = (int) (lengthValueInput * 0.3048);
			System.out.println(lengthValueInput + lengthUnitTypeInput + " is " + lengthMeters + "m.");
		}


	}

}
