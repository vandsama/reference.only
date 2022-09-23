package com.techelevator;

import java.util.Stack;

public class Brackets {
    public static void main(String[] args) {

        System.out.println(" '()'? " + isBalanced("()"));
        System.out.println(" '(()'? " + isBalanced("(()"));
        System.out.println(" '[]'? " + isBalanced("[]"));
        System.out.println(" '[]'? " + isBalanced("]["));
        System.out.println(" ']['? " + isBalanced("]["));
        System.out.println(" '([])'? " + isBalanced("([])"));


//        isBalanced("()")
//        "()"
//        "{}"
//        "([])"
//        "([)]"



    }

    public static boolean isBalanced(String input) {

        Stack<Character> brackets = new Stack<>();

        for(int index=0; index < input.length(); index++) {

            Character theCharacter = input.charAt(index);
            if (brackets.isEmpty()) {
                brackets.push(theCharacter);
            } else if ((theCharacter == ')' && brackets.peek() == '(' ) || (theCharacter == ']' && brackets.peek() == '[' ) ) {
                  brackets.pop();
            } else {
                brackets.push(theCharacter);
            }

        }

        return brackets.isEmpty();
    }
}
