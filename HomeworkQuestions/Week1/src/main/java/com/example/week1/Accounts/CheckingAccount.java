package com.example.week1.Accounts;

public class CheckingAccount extends Account {

    // do i need to do so if it will use super?

    CheckingAccount()
    {
        this.id = 0;
        this.balance = 0;
        this.setAnnualInterestRate(0);
    } // no arg constructor

    CheckingAccount(int inputId, double inputBalance)
    {
        this.id = inputId;
        this.balance = inputBalance;
    }

    @Override
    public void withdraw(double amtToWithdraw)
    {

        if(amtToWithdraw > overdraftLimit)
            System.out.println("over limit");
    }
}
