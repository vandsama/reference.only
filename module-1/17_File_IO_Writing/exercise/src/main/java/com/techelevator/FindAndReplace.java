package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FindAndReplace {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("What is the search word?");
        String searchWord = userInput.nextLine();

        System.out.println("What is the replacement word?");
        String replacementWord = userInput.nextLine();

        System.out.println("What is the source file?");
        String sourceFileName = userInput.nextLine();
        File searchFile = new File(sourceFileName);

        System.out.println("What is the destination file?");
        String destinationFileName = userInput.nextLine();
        File destinationFile = new File(destinationFileName);

        String newLineOfText;

        try (Scanner fileInput = new Scanner(searchFile); PrintWriter writer = new PrintWriter(destinationFile)) {
            while (fileInput.hasNextLine()) {
                String lineOfText = fileInput.nextLine();

                newLineOfText = lineOfText.replaceAll(searchWord,replacementWord);

                writer.println(newLineOfText);
            }
        } catch (FileNotFoundException e) {
            System.out.println("The file was not found: " + searchFile.getAbsolutePath());
            return;
        }


    }

}
