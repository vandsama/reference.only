package com.techelevator;

public class Loops {
    public static void main(String[] args) {

//        int x = 0;
//        while (x <= 10) {
//            System.out.println(x);
//            x++;
//        }
//        System.out.println("outside the X loop");

        for(int y=0; y<=10; y+=1) {
            if (y == 5) {
                continue;
            }
            System.out.println(y);
        }
        System.out.println("outside the Y loop");
    }
}
