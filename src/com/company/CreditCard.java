package com.company;

public class CreditCard {
    private double accountBalance = 5000.00;

    public double getBalance(){
        return accountBalance;
    }

    public void makeWithdraw(double draw ){
        accountBalance = accountBalance - draw;
    }
}