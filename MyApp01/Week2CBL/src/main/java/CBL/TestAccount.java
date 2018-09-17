package CBL;

public class TestAccount {

    public static void main(String [] args)
    {
        Account myaccount = new Account();
        System.out.println(myaccount.getBalance());

        myaccount.deposit(100);
        System.out.println(myaccount.getBalance());

        myaccount.withdraw(200);
        System.out.println(myaccount.getBalance());
    }
}
