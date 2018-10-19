package CBL;

public class Account {
    private int id = 1;
    private double balance = 1000;

    public void withdraw(double amt)
    {
        this.balance -= amt;
    }

    public void deposit(double amt)
    {
        this.balance += amt;
    }
    public double getBalance()
    {
        return this.balance;
    }

}
