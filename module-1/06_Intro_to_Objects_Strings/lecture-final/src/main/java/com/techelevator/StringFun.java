package com.techelevator;

public class StringFun {
    public static void main(String[] args) {

        int[] a = {1,2,3,5};
        String s = "literal";

        // length
        System.out.println(s.length());
        String e = "";
        System.out.println(e.length());
        String allWhiteSpace = "      ";
        System.out.println(allWhiteSpace.length());
        String oneSpace = " ";
        System.out.println(oneSpace.length());

        if (e.length() == 0) {
            // do something
        }

        // substring()
        String alpha = "abcdefghijklm";
        System.out.println(alpha.substring(10));
        System.out.println(alpha.substring(0));
        System.out.println(alpha.substring(0,4));
        System.out.println(alpha.substring(4,7));

        // indexOf()
        System.out.println(alpha.indexOf("bc"));
        System.out.println(alpha.indexOf("not-there"));
        System.out.println("abba".indexOf("b"));
        System.out.println("abba".indexOf("b", 2));

        // charAt()
        System.out.println(alpha.charAt(1));

        // contains()
        System.out.println(alpha.contains("abc"));
        // this is good
        if (alpha.contains("abc")) {
            // do something useful
        }

        // this is not as good
        if (alpha.indexOf("abc") > -1) {
            // do something useful
        }

        String c = "a";
        String cHold = c;
        c = c + "b";
        System.out.println(c);
        System.out.println(cHold);

        System.out.println(alpha.toUpperCase());
        System.out.println(alpha);

        // replace
        System.out.println(alpha.replace("def", "-mike-"));

        String multi = "1,2,3,4";
        String[] parts = multi.split(",");
        String whole = String.join("-", parts);
        System.out.println(whole);
        whole = String.join("", parts);
        System.out.println(whole);

        System.out.println("** manual way **");
        String result = "";
        for(int i = 0; i < parts.length; i++) {
            result += parts[i] + "-";
        }
        System.out.println(result);

        // startsWith() & endsWith()
        String source = "abc";
        if ("ab".equals(source.substring(0, "ab".length()))) {
            System.out.println("yes");
        }

        if (source.startsWith("ab")) {
            System.out.println("also yes");
        }

    }
}
