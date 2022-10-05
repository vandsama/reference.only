package com.techelevator;

import java.io.File;
import java.util.Scanner;

public class CreateFolder {
    public static void main(String[] args) {

        final File pwd = new File("");
        System.out.printf("currently running in %s\n", pwd.getAbsolutePath());

        final Scanner ussrInput = new Scanner(System.in);
        System.out.println("what is the name of the folder to create?");
        final String path = ussrInput.nextLine();

        final File f = new File(path);
        if (f.exists()) {
            System.out.println("that folder already exists");
        } else {
            if( f.mkdir()) {
                System.out.println("folder was created successfully");
                System.out.printf("@ %s\n", f.getAbsolutePath());
            } else {
                System.out.println("sorry but could not create the folder");
            }
        }


    }
}
