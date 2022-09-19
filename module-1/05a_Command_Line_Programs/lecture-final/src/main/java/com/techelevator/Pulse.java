package com.techelevator;

public class Pulse {
    public static void main(String[] args) {

        int index1 = 0;
        while (index1 < 10) {
            System.out.println(index1);
        }

        int index2 = 0;
        do {
            System.out.println(index2);
        } while (index2 < 10);

        for(int index3 = 0; index3 < 10; index3++) {
            System.out.println(index3);
        }

        int[] myArray = new int[0];
        for (int index4 = 0; index4 <= myArray.length-1; index4++) {
            // this will not be called
        }

    }

    // Calculate(2,3) -> 6
    // Calculate(-3, 4) ->
    public static int CalculateArea(int w, int h) {

        if (w <= 0 || h <= 0 ) {
            return 0;
        }

        return w * h;
    }

}
