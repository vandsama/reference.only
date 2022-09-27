package com.techelevator;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }

    public int withdraw(int amountToWithdraw) {
        int remainingBalance = getBalance() - amountToWithdraw;

        //withdrawal is denied if remaining balance is negative
        if(remainingBalance < 0) {
            // withdrawal denied
        }

        else if (remainingBalance >= 150){
            super.withdraw(amountToWithdraw);
        }

        else if (remainingBalance - 2 < 0){
            //withdrawal denied
        }

        else if (remainingBalance < 150){
            if ((getBalance() - amountToWithdraw + 2) < 0) {
                return getBalance();
            } else {
                super.withdraw(amountToWithdraw + 2);
            }

        }


        return getBalance();
    }


}
