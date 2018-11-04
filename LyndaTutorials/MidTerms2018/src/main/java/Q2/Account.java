package Q2;


import java.util.Date;

//starting code

public class Account implements Comparable<Account>{
    private String id;
    private double balance;
    private Date dateCreated;

    @Override
    public int compareTo(Account account) {
        if(this.balance > account.balance)
            return 1;
        else if (this.balance == account.balance)
            return 0;
        else
            return -1;
    }

    Account(String ID, double initBalance)
    {
        this.id = ID;
        this.balance = initBalance;
    }

    public String getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString()
    {
        return "Account:"+getId();
    }
}
