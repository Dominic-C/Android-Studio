package com.example.week1.Accounts;

import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private static double annualInterestRate; // in percentage
    private Date dateCreated;

    Account()
    {
//        this.id = 0;
//        this.balance = 0;
//        this.setAnnualInterestRate(0);

        // Used setters so that subclasses can use private attributes with super
        setId(0);
        setBalance(0);
        setAnnualInterestRate(0);
    } // no arg constructor

    Account(int inputId, double inputBalance)
    {
        // Used setters so that subclasses can use private attributes with super
        setId(inputId);
        setBalance(inputBalance);
    }

    public int getId()
    {
        return this.id;
    }

    public void setId(int newId)
    {
        this.id = newId;
    }

    public double getBalance()
    {
        return this.balance;
    }

    public void setBalance(double newBalance)
    {
        this.balance = newBalance;
    }

    public static void setAnnualInterestRate(double newInterestRate)
    {
        annualInterestRate = newInterestRate;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public double getMonthlyInterestRate()
    {
        return (annualInterestRate/12.0);
    }

    public double getMonthlyInterest()
    {
        double monthlyInterestRate = getMonthlyInterestRate();
        double monthlyInterest = this.balance * monthlyInterestRate/100.0;
        return monthlyInterest;
    }

    public void withdraw(double amountToWidthdraw)
    {
        this.balance = this.balance - amountToWidthdraw;
    }

    public void deposit(double amountToDeposit)
    {
        this.balance = this.balance + amountToDeposit;
    }


    public Date getDateCreated() {
        return this.dateCreated;
    }
}