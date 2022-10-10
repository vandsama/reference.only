package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FizzWriter {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("What is the destination file?");
		String destinationFileName = userInput.nextLine();
		File destinationFile = new File(destinationFileName);

	try (PrintWriter writer = new PrintWriter(destinationFile)) {
		for (int i = 1; i <= 300; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				writer.println("FizzBuzz");
			}
			else if (i % 3 == 0){
				writer.println("Fizz");
			}
			else if (i % 5 == 0) {
				writer.println("Buzz");
			}
			else {
				writer.println(i);
			}
		}
//		If the number is divisible by 3, print Fizz.

//		If the number is divisible by 5, print Buzz.

//		If the number is divisible by 3 and 5, print FizzBuzz.

//		Otherwise, print the number.



	} catch (
	FileNotFoundException e) {
		System.out.println("The file was not found: " + destinationFile.getAbsolutePath());
		return;
	}
	}

}
