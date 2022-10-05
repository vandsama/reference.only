package com.techelevator;

public class Pulse {

    public static void main(String[] args) {
        try {
            a();
        } catch (ArithmeticException ae) {
            System.out.println("please don't divide by zero");
        } catch (OutOfStockException mothergoose) {
            System.out.println(mothergoose.getMessage());
        }


    }

    public static void a() {
        try {
            b();
        } catch (ArithmeticException ae) {
            System.out.println("caught and handled in a()");
        }
        throw new OutOfStockException("there are no more chips to purchase");

    }

    public static void b() {
        c();
    }

    public static void c() {
        int result = 3/0;
    }


    public int makeCare(int rank, int suit) {

        // parameter checking
        if (rank < 1 || rank > 13) {
            throw new IllegalArgumentException("rank must be between 1 and 13");
        }

        if (suit < 1 || suit > 4) {
            throw new IllegalArgumentException("suit must be between 1 and 4");
        }

        // build the card instance

        return 0;
    }

}
