package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		String numberValueInputAsString = input.nextLine();
		int numberValueInput = Integer.parseInt(numberValueInputAsString);

		// create Fibonacci array
		long[] fibonacciArray = new long[numberValueInput];
		int n = 0;
		int k = 1;
		int j = 1;

		if(numberValueInput == 0){
			System.out.println("0, 1");
		}
		else if(numberValueInput == 1){
			System.out.println("0, 1, 1");
		}
		else{
			System.out.print("0, 1, 1");
			while(n < numberValueInput) {

				n = j + k;
				j = k;
				k = n;
				if (n > numberValueInput) {
					break;
				}
				System.out.print( ", "+ n);
		}

		}


//		for(int i=2; i < numberValueInput; i++){
//			fibonacciArray[i] = fibonacciArray[i-1] + fibonacciArray[i-2];
//			System.out.print(fibonacciArray[i] + ", ");
//		}

		}

	}


