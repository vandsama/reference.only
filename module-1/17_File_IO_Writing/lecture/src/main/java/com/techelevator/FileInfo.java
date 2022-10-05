package com.techelevator;

import java.io.File;
import java.util.Scanner;

public class FileInfo {
    public static void main(String[] args) {

        final File pwd = new File("");
        System.out.printf("currently running in %s\n", pwd.getAbsolutePath());

        final Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter the name of a file");
        final String path = userInput.nextLine(); // program will "block" until the user presses <enter>

        final File f = new File(path);
        if (f.exists()) {
            System.out.printf("name: %s\n", f.getName());
            System.out.printf("path: %s\n", f.getAbsolutePath());
            if (f.isFile()) {
                System.out.println("is a file");
                System.out.printf("size: %s\n", f.length());
            } else if(f.isDirectory()) {
                System.out.println("is a folder");
            } else {
                System.out.println("is a folder");
            }
        } else {
            System.out.printf("%s does not exist", path);
        }

    }
}
