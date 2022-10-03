package com.techelevator.exceptions;

import java.util.zip.DataFormatException;

public class CheckingAccount {
    private int balance = 0;

    public CheckingAccount(int balance) {
        this.balance = balance;
    }

    //                              with checked exception
    public int withdraw(int amount) throws DataFormatException {

        // defensive programming
        if (amount < 0) {
            throw new IllegalArgumentException("cannot withdraw negative amounts");
        }

        if (amount > balance) {
            throw new IllegalArgumentException("cannot withdraw more than the balance");
        }



        balance -= amount;  // happy path
        return balance;

    }

}
