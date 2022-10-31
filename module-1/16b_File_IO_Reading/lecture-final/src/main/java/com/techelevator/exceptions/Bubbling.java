package com.techelevator.exceptions;

import java.io.FileNotFoundException;

public class Bubbling {
    public static void main(String[] args) {
        methodA();
    }

    public static void methodA() {
        try {
            methodB();
        } catch (IllegalArgumentException iae) {
            System.out.println("got ya!");
        }
    }

    public static void methodB() {
        try {
            methodC();
        } catch (IllegalMonitorStateException fnf) {
            System.out.println("not hear");
        }
    }

    public static void methodC() {
        throw new IllegalArgumentException("this is my exception");
    }

}
