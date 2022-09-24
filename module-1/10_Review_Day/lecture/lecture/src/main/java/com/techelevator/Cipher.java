package com.techelevator;

import java.util.HashMap;
import java.util.Map;

public class Cipher {
    public static void main(String[] args) {
        Cipher c = new Cipher();
        System.out.println(c.encrypt("HELLO"));
        System.out.println(c.decrypt(c.encrypt("HELLO")));

        System.out.println(c.encrypt(("HE'LL")));
    }

    public String encrypt(String source) {

        String result = "";
        Map<Character, Character> lookUp = new HashMap<>();
        lookUp.put('H', 'L');
        lookUp.put('O', 'D');
        lookUp.put('E', 'G');
        lookUp.put('L', 'R');

        // iterate the source string
        for(int index = 0; index < source.length(); index++){
            char theLetter = source.charAt(index);

            // lookup encrypt or 'sub' value
            char replacementChar = lookUp.getOrDefault(theLetter, theLetter);

            // create new string
            result += replacementChar;
        }


        return result;
    }







    public String decrypt(String encrypted) {
        String result = "";
        Map<Character, Character> lookUp = new HashMap<>();
        lookUp.put('L', 'H');
        lookUp.put('D', 'O');
        lookUp.put('G', 'E');
        lookUp.put('R', 'L');

        // iterate the source string
        for(int index = 0; index < encrypted.length(); index++){
            char theLetter = encrypted.charAt(index);

            // lookup encrypt or 'sub' value
            char replacementChar = lookUp.get(theLetter);

            // create new string
            result += replacementChar;
        }
        return result;
    }

}
