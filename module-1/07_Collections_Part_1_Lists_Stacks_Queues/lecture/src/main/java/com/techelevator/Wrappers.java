package com.techelevator;

public class Wrappers {
    public static void main(String[] args) {

        int a =0;
        long b = 0;
        float c = 0f;   // add the 'f' to indicate literal
        double d = 0.0;

        // boxing (from primitive to wrapped object)
        // unboxing (from wrapped object to primitive)
        Integer wa = 4;
        System.out.println(wa);
        System.out.println(wa*2);

        // unboxing
        int e = wa;
        char m = 'm';
        Character wm = m;

    }
}
