package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the temperature: ");
		String temperatureValueInputAsString = input.nextLine();
		int temperatureValueInput = Integer.parseInt(temperatureValueInputAsString);

		System.out.print("Is the temperature in (C)elsius, or (F)ahrenheit? ");
		String temperatureTypeInput = input.nextLine();

		if(temperatureTypeInput == "C") {
			int temperatureCelsius = (int) (temperatureValueInput * 1.8 + 32);
			System.out.println(temperatureValueInput + temperatureTypeInput + " is " + temperatureCelsius + "F.");
		}

		else {
			int temperatureFahrenheit = (int) ((temperatureValueInput - 32) / 1.8);
			System.out.println(temperatureValueInput + temperatureTypeInput + " is " + temperatureFahrenheit + "C.");
		}


	}

}
