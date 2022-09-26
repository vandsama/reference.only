package com.techelevator;

import java.util.HashMap;
import java.util.Map;

public class Cipher {
    public static void main(String[] args) {
        Cipher c = new Cipher();
        System.out.println(c.encrypt("HELLO"));
        System.out.println(c.decrypt(c.encrypt("HELLO")));

        System.out.println(c.encrypt("HE'LL"));
        System.out.println(c.decrypt(c.encrypt("HE'LL")));
    }

    public String encrypt(String source) {
        String result = "";
        Map<Character, Character> lookup = new HashMap<>();
        lookup.put('H', 'L');
        lookup.put('O', 'D');
        lookup.put('E', 'G');
        lookup.put('L', 'R');
        // and 22 more

        // interate the source string
        for (int index = 0; index < source.length(); index++) {
            char theLetter = source.charAt(index);

            // lookup sub value
            char replacementChar = ' ';
            if (lookup.containsKey(theLetter)) {
                replacementChar = lookup.get(theLetter);
            } else {
                replacementChar = theLetter;
            }

            // create new string
            result += replacementChar;
        }

        return result;
    }

    public String decrypt(String encrypted) {
        String result = "";
        Map<Character, Character> lookup = new HashMap<>();
        lookup.put('L', 'H');
        lookup.put('D', 'O');
        lookup.put('G', 'E');
        lookup.put('R', 'L');

        for (int index = 0; index < encrypted.length(); index++) {
            char theLetter = encrypted.charAt(index);

            // lookup sub value
            char replacementChar = lookup.getOrDefault(theLetter, theLetter);

            // create new string
            result += replacementChar;
        }
        return result;
    }
}
