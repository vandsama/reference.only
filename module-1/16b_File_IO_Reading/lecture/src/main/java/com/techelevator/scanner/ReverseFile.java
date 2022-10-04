package com.techelevator.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReverseFile {
    public static void main(String[] args) {

        final Scanner userInput = new Scanner(System.in);
        System.out.println("enter the full path to a file");
        final String filename = userInput.nextLine();

        final File fileToReverse = new File(filename);                  // wrap with file object
        try {
            final Scanner fileReader = new Scanner(fileToReverse);      // open with scanner
            while(fileReader.hasNextLine()) {                           // while there are still lines to read, do...
                final String lineOfText = fileReader.nextLine();
                final StringBuilder sb = new StringBuilder(lineOfText);
                System.out.println(sb.reverse().toString());
            }
            fileReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("cannot find the file you entered");
        }


    }
}
