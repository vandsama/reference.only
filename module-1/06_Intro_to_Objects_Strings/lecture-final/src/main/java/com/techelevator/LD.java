package com.techelevator;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LD {
    public static void main(String[] args) {

        LocalDate myDate = LocalDate.now();
        System.out.println(myDate);

        LocalDate anotherDate = LocalDate.of(2021, 3, 23);
        System.out.println(anotherDate);

        System.out.println(myDate.equals(anotherDate));
        System.out.println(myDate.isBefore(anotherDate));
        System.out.println(myDate.isAfter(anotherDate));

        System.out.println(anotherDate.plusYears(1));

        LocalDate endOfJan = LocalDate.of(2022, 01, 31);
        System.out.println(endOfJan.plusDays(30));
        System.out.println(endOfJan.plusMonths(1));
        System.out.println(endOfJan.plusMonths(1).plusMonths(1));
        System.out.println(endOfJan.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(endOfJan.format(DateTimeFormatter.ofPattern("yyyy MM dd")));
        System.out.println(endOfJan.format(DateTimeFormatter.ofPattern("yyyy MMM dd")));
        System.out.println(endOfJan.format(DateTimeFormatter.ofPattern("yyyyMMdd")));
        System.out.println(endOfJan.format(DateTimeFormatter.ofPattern("MMM dd yyyy")));
        System.out.println(endOfJan.plusMonths(-10));



    }
}
