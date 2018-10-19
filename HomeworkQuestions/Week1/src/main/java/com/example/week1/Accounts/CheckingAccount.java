package com.example.week1.Accounts;

public class CheckingAccount extends Account {

    int overdraftLimit = 5000;

    CheckingAccount(int inputID, double inputBalance) // not public, only visible to Accounts package
    {
        super(inputID, inputBalance);
    }


    @Override
    public void withdraw(double amtToWithdraw)
    {
        // to understand this question better, google the term overdraft limit in banking
        if(this.getBalance() <= -5000) // if i hit overdraft limit, i cannot withdraw anymore
            System.out.println("over limit");
        else
        {
            super.withdraw(amtToWithdraw);
        }
    }
}
