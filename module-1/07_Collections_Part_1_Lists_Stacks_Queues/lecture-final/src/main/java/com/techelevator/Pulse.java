package com.techelevator;

public class Pulse {
    public static void main(String[] args) {

        String str = "abcdefg";
        for (int index=0; index < str.length()-1; index++) {
            String rest = str.substring(index, index+2);
            System.out.println(rest);
        }

    }
}
