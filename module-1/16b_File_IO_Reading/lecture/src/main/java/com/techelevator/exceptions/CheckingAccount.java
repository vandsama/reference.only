package com.techelevator.exceptions;

public class CheckingAccount {
    int balance = 0;

    public CheckingAccount(int balance) {
        this.balance = balance;
    }

    public int withdraw(int amount) {

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
