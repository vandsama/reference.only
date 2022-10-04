package com.techelevator.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReverseFile {
    public static void main(String[] args) {

//        File pwd = new File("");
//        System.out.println(pwd.getAbsolutePath());
//        System.exit(1);

        final Scanner userInput = new Scanner(System.in);
        System.out.println("enter the full path to a file");
        final String filename = userInput.nextLine();

        final File fileToReverse = new File(filename);

        if (!fileToReverse.exists()) {
            System.out.println("please provide the name of a file");
            System.exit(1);
        }

        if (!fileToReverse.isFile()) {
            System.out.println("you did not give the name of a file");
            System.exit(1);
        }

        // try with Resource will automatically call Close() on fileReader
        try(Scanner fileReader = new Scanner(fileToReverse)) {
            while(fileReader.hasNextLine()) {
                final String lineOfText = fileReader.nextLine();
                final StringBuilder sb = new StringBuilder(lineOfText);
                System.out.println(sb.reverse().toString());
            }
        } catch (FileNotFoundException e) {
            System.out.println("cannot find the file you entered");
        }


        /**
         *         final File fileToReverse = new File(filename);
         *         Scanner fileReader = null;
         *         try {
         *             fileReader = new Scanner(fileToReverse);
         *             while(fileReader.hasNextLine()) {
         *                 final String lineOfText = fileReader.nextLine();
         *                 final StringBuilder sb = new StringBuilder(lineOfText);
         *                 System.out.println(sb.reverse().toString());
         *             }
         *         } catch (FileNotFoundException e) {
         *             System.out.println("cannot find the file you entered");
         *         }
         *         finally {
         *             if (fileReader != null) {
         *                 fileReader.close();
         *             }
         *         }
         */

    }
}
