package com.techelevator.access.two;

import com.techelevator.access.one.A;

public class C extends A {
    public void foo() {
        this.myPublicString = "I can see you";
        this.myProtectedString = "I see you too!";
    }
}
