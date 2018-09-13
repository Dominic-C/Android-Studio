package com.example.week1;

import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private static double annualInterestRate = 0; // in percentage
    private Date dateCreated;

    Account(){} // no arg constructor

    Account(int inputId, double inputBalance)
    {
        this.id = inputId;
        this.balance = inputBalance;
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