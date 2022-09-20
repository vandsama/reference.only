package com.techelevator;

public class Objs {
    public static void main(String[] args) {

        int[] a = new int[4];
        System.out.println(a);

        int[] b = null;
        System.out.println(b);
//        b[0] = 4;
        b = new int[5];

//        a[6] = 8;

        String[] sarra = new String[4];
        System.out.println(sarra[0]); // null
        sarra[0] = "hello world";
        System.out.println(sarra[0]); // hw string

    }
}
