package com.techelevator;

import java.io.*;
import java.time.LocalDateTime;
import java.util.Scanner;

public class WriteFile {
    public static void main(String[] args) {
        final Scanner userInput = new Scanner(System.in);
        System.out.println("what is the name of the file to create?");
        final String filename = userInput.nextLine();

        final File f = new File(filename);
        try (final FileOutputStream fos = new FileOutputStream(f, true);
             final PrintWriter writer = new PrintWriter(fos)) {
            writer.printf("the time is now %s \n", LocalDateTime.now());
        } catch (FileNotFoundException e) {
            System.out.println("could not create the file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
