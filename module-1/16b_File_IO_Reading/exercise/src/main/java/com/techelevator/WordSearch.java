package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) {
        // Step 1: Prompt the user for a filename
		// Create a scanner for user input
		Scanner userInput = new Scanner(System.in);
		// Prompt the user for a file path - path should look like "data/jekyll-and-hyde.txt"
		System.out.print("What is the fully qualified name of the file that should be searched? ");
		String filePath = userInput.nextLine();

        // Step 2: Step Two: Open the book file and handle errors
		// Create a File object using the path
		File bookFile = new File(filePath);
		// Setup some variables used in the loop
		int lineCount = 0;          // Count of lines between the start and end markers.


		// Get search word from user
		System.out.println("What is the search word you are looking for? ");
		String searchWord = userInput.nextLine();

		// Get search word from user

		System.out.println("Should the search be case sensitive? (Y\\N) ");
		String isCaseSensitive = userInput.nextLine();


		// Open the file
		try (Scanner fileInput = new Scanner(bookFile)) {
            // Step 3: Create a read loop and process the lines
			// Loop until the end of file is reached
			while (fileInput.hasNextLine()) {
				// Read the next line into 'lineOfText'
				String lineOfText = fileInput.nextLine();

				// Increment the line count.
				lineCount++;

				if (isCaseSensitive.equalsIgnoreCase("y") && lineOfText.contains(searchWord)) {
					System.out.println(lineCount + ": " + lineOfText);
				} else if (isCaseSensitive.equalsIgnoreCase( "N") && lineOfText.toLowerCase().contains(searchWord.toLowerCase())) {
					// Print the line
					System.out.println(lineCount + ": " + lineOfText);
				}

			}
		} catch (FileNotFoundException e) {
			// Could not find the file at the specified path.
			System.out.println("The file was not found: " + bookFile.getAbsolutePath());
		}
		// Tell the user how many lines of content were found.
		//System.out.println("Found " + lineCount + " lines of text in " + filePath);
	}
}








