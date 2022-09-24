package com.techelevator;

public class StringFun {
    public static void main(String[] args) {
        StringFun sf = new StringFun();
        System.out.println(sf.reverse("helloworld"));
    }

    public String reverse(String str) {
        if (str.length() == 1) {
            return str;
        }

        String firstChar = str.substring(0,1);
        String theRest = str.substring(1);

        return reverse(theRest) + firstChar;
    }
}
