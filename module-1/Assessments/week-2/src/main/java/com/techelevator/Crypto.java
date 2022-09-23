package com.techelevator;

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

    /**
     * Encrypts and returns "strToEncrypt" using the substitution cypher above
     *
     * @param strToEncrypt The String to encrypt
     * @return The encrypted String
     */
    public String encrypt(String strToEncrypt) {
        Map<String, String> encryptionKey = new HashMap<String, String>();
        encryptionKey.put("A","N");
        encryptionKey.put("B","J");
        encryptionKey.put("C","F");
        encryptionKey.put("D","Q");
        encryptionKey.put("E","A");
        encryptionKey.put("F","P");
        encryptionKey.put("G","S");
        encryptionKey.put("H","R");
        encryptionKey.put("I","X");
        encryptionKey.put("J","G");
        encryptionKey.put("K","D");
        encryptionKey.put("L","O");
        encryptionKey.put("M","T");
        encryptionKey.put("N","E");
        encryptionKey.put("O","U");
        encryptionKey.put("P","H");
        encryptionKey.put("Q","M");
        encryptionKey.put("R","V");
        encryptionKey.put("S","B");
        encryptionKey.put("T","C");
        encryptionKey.put("U","W");
        encryptionKey.put("V","K");
        encryptionKey.put("W","Z");
        encryptionKey.put("X","I");
        encryptionKey.put("Y","L");
        encryptionKey.put("Z","Y");
// The strToEncrypt will be the driver
// Break down the strToEncrypt into its components

        for (Map.Entry<String, String> encryptedCharacter : encryptionKey.entrySet()) {
            // encryptedCharacter.getValue() will return the corresponding encryption character
            if (encryptedCharacter.getValue() == "A") {
                System.out.print(encryptedCharacter.getKey());
            } else if (encryptedCharacter.getValue() == "B"){
                System.out.print(encryptedCharacter.getKey());
            }
        }
       return null;
    }

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
