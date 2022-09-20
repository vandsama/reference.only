package com.techelevator;

import java.math.BigDecimal;

public class BigD {
    public static void main(String[] args) {

        BigDecimal bd1 = new BigDecimal(1);
        System.out.println(bd1);
        BigDecimal bd2 = new BigDecimal("3.14");
        System.out.println(bd2);
        System.out.println(bd2.add(BigDecimal.ONE));
        System.out.println(bd2.subtract(BigDecimal.ONE));
        System.out.println(bd2);
        System.out.println(BigDecimal.valueOf(4,4));
        System.out.println(bd1.compareTo(bd2));
        if (bd1.compareTo(bd2) < 0) {
            // do something useful
        }

    }
}
