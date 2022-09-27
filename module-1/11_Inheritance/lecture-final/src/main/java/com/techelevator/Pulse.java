package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Pulse {

    public static void main(String[] args) {
        Pulse p = new Pulse();
        Pulse myPulse = Pulse.BuildPulseFrom();

        List<String> myList = new ArrayList<>();
    }

    private int numberOfFruitsRemaining = 10;
    private int myparm = 0;
    public final static int SOME_CONSTANT = 5;
    private int computed = numberOfFruitsRemaining / myparm;


    public Pulse(int startingFruitCount, int myparm) {
        this.numberOfFruitsRemaining = startingFruitCount;
        this.myparm = myparm;
    }

    public Pulse() {
        this(100, 0);
    }

    public int getNumberOfFruitsRemaining() {
        return this.numberOfFruitsRemaining;
    }

    public static Pulse BuildPulseFrom() {
        Pulse p = new Pulse();
        // some complex code here
        return p;
    }

}
