package com.techelevator.access.one;

public class B {
    public void foo() {
        A a = new A();
        a.myPackageString = "I see you!";
        a.myProtectedString = "I see you too!";
        a.myPublicString = "this one also. no surprise";
    }
}
