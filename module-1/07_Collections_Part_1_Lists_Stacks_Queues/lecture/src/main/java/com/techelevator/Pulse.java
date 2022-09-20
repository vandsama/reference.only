package com.techelevator;

import java.util.*;

public class Pulse {
    public static void main(String[] args) {
// iterate across string, & print out from that point forward what remains
        String str = "abcdefg";
        for (int index=0; index < str.length()-1; index++) {
            String rest = str.substring(index, index+2);
            System.out.println(rest);
        }

        ArrayList<String> al = new ArrayList<>();



    }
}
