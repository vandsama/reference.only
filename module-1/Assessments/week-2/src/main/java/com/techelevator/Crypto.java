package com.techelevator;

import javax.print.DocFlavor;
import java.util.HashMap;
import java.util.Map;

/**
 * Crypto encrypts strings using a substitution cypher. In a substitution
 * cypher, every letter is replaced with a different letter.
 *
 * For this exercise, use the following substitution cypher:
 *
 *   Letter -> Encrypts To
 *     A    ->    N
 *     B    ->    J
 *     C    ->    F
 *     D    ->    Q
 *     E    ->    A
 *     F    ->    P
 *     G    ->    S
 *     H    ->    R
 *     I    ->    X
 *     J    ->    G
 *     K    ->    D
 *     L    ->    O
 *     M    ->    T
 *     N    ->    E
 *     O    ->    U
 *     P    ->    H
 *     Q    ->    M
 *     R    ->    V
 *     S    ->    B
 *     T    ->    C
 *     U    ->    W
 *     V    ->    K
 *     W    ->    Z
 *     X    ->    I
 *     Y    ->    L
 *     Z    ->    Y
 */
public class Crypto {
    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String cipher = "NJFQAPSRXGDOTEUHMVBCWKZILY";

    public Map<Character, Character> makeMap () {
        Map<Character, Character> EncryptionMap = new HashMap<>();
        for (int i = 0; i < alphabet.length(); i++) {
            char aChar = alphabet.charAt(i);
            char cChar = cipher.charAt(i);
            if (!EncryptionMap.containsKey(aChar)) {
                EncryptionMap.put(aChar, cChar);
            }
        }
        return EncryptionMap;
    }

    public Map<Character,Character> makeAnotherMap() {
        Map<Character,Character> DecryptionMap = new HashMap<>();
        for (int i = 0; i < alphabet.length(); i++) {
            char aChar = alphabet.charAt(i);
            char cChar = cipher.charAt(i);
            if (!DecryptionMap.containsKey(cChar)) {
                DecryptionMap.put(cChar,aChar);
            }
        } return DecryptionMap;
    }

    public Map<Character,Character> rotate(Map<Character,Character> parameter) {
        for (Map.Entry<Character, Character> chars: parameter.entrySet()) {
            parameter.put(chars.getValue(), chars.getKey());
        }
        return parameter;
    }

    /**
     * Encrypts and returns "strToEncrypt" using the substitution cypher above
     *
     * @param strToEncrypt The String to encrypt
     * @return The encrypted String
     */
    public String encrypt(String strToEncrypt) {

// The strToEncrypt will be the driver
// Break down the strToEncrypt into its components

        // Create Encryption Map:
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String cipher = "NJFQAPSRXGDOTEUHMVBCWKZILY";

        Map<Character, Character> stuff = new HashMap<>();

        for (int i = 0; i < alphabet.length(); i++) {
            char aChar = alphabet.charAt(i);
            char cChar = cipher.charAt(i);
            if (!stuff.containsKey(aChar)) {
                stuff.put(aChar, cChar);
            }
        }

        // Encrypt message, eg, "HELLO -> RAOOU"
        String encryptedMessage = "";

        for (int i = 0; i < strToEncrypt.length(); i++) {
            char messageChar = strToEncrypt.charAt(i);
            if (stuff.containsKey(messageChar)) {
                encryptedMessage += stuff.get(messageChar);
            } else {
                encryptedMessage += messageChar;
            }
            return encryptedMessage;
        }
        return  encryptedMessage;
    }
        // Decrypt message, eg, "RAOOU -> HELLO"


//        for (Map.Entry<String, String> encryptedCharacter : encryptionKey.entrySet()) {
//            // encryptedCharacter.getValue() will return the corresponding encryption character
//            if (encryptedCharacter.getValue() == "A") {
//                System.out.print(encryptedCharacter.getKey());
//            } else if (encryptedCharacter.getValue() == "B"){
//                System.out.print(encryptedCharacter.getKey());
//            }
//        }
//       return null;


        /**
         * Decrypts and returns "strToDecrypt" using the cypher above
         *
         * @param strToDecrypt The String to decrypt
         * @return The decrypted String
         */

       public String decrypt(String strToDecrypt) {
           return null;
       }

}
