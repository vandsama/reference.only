package com.techelevator.exceptions;

import java.util.zip.DataFormatException;

public class Teller {
    public static void main(String[] args) throws DataFormatException {

        CheckingAccount account = new CheckingAccount(200);
        account.withdraw(1000);


    }
}
