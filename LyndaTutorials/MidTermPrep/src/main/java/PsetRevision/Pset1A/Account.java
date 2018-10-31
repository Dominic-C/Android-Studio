package PsetRevision.Pset1A;

import java.util.Date;

public class Account {
    private int id = 0;
    private double balance = 0;
    private static double annualInterestRate = 0;
    private Date dateCreated;

    Account()
    {
        this(0,0);
    }

    Account(int newID, double newBalance)
    {
        this.id = newID;
        this.balance = newBalance;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(double amt) {
        annualInterestRate = amt;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public double getMonthlyInterestRate()
    {
        return (getAnnualInterestRate()/100)/12.0; // getAnnualInterestRate is in percentage, eg 90. so divide by 100 first to get annual Rate
    }

    public double getMonthlyInterest()
    {
        return getBalance() * getMonthlyInterestRate();
    }

    public void withdraw(double amt)
    {
        setBalance(getBalance()-amt);
    }

    public void deposit(double amt)
    {
        setBalance(getBalance()+amt);
    }
}
