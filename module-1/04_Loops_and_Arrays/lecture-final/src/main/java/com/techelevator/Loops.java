package com.techelevator;

import javax.naming.BinaryRefAddr;

public class Loops {
    public static void main(String[] args) {

//        int x = 0; // <== init
//        while (x <= 10) {  // <== condition
//            System.out.println(x);
//            break;
////            x++; // <== incrementing
//        }
//        System.out.println("outside the X loop");

        for (int y = 0; y <= 10; y += 1) {
            if (y == 5) {
                continue;
            }
            System.out.println("hello class");
        }
        System.out.println("outside the Y loop");

        boolean run = false;
        while (run) {
            System.out.println("you won't see this");
        }

        do {
            System.out.println("you will see this");
        } while (run);

    }
}
