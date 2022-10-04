package com.techelevator.exceptions;

public class Teller {
    public static void main(String[] args) {

        CheckingAccount account = new CheckingAccount(200);
        account.withdraw(1000);
    }
}
