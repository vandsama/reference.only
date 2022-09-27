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
    public final static int SOME_CONSTANT = 5;

    public Pulse(int startingFruitCount) {
        this.numberOfFruitsRemaining = startingFruitCount;
    }

    public Pulse() {
        this(100);
    }

    public int getNumberOfFruitsRemaining() {
        return this.numberOfFruitsRemaining;
    }

    public void setNumberOfFruitsRemaining(int pieces) {
        if (pieces > 0 && pieces < this.numberOfFruitsRemaining) {
            this.numberOfFruitsRemaining = pieces;
        }
        return;
    }

    public static Pulse BuildPulseFrom() {
        Pulse p = new Pulse();
        // some complex code here
        return p;
    }

}
