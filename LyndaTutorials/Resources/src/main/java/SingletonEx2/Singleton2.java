package SingletonEx2;

public class Singleton2 {
    /**
     * To make a class into a singleton class, we can do the following
     * 1. create a static instance of the class
     * 2. Make the default constructor private
     * 3. Make a public getter method to get afore mentioned static instance
    * */

    // make private, static instance of the class
    private static Singleton2 singleton = new Singleton2();

    // make constructor private
    private Singleton2(){}

    // getter method
    public static Singleton2 getInstance() // needs to be static because we are not creating new instances, but referring to the same one
    {
        return singleton;
    }

}

class Main
{
    public static void main(String[] args) {
//        Singleton2 abc = new Singleton2(); we cannot do this because constructor is private. Instead, we must use getter methods
        Singleton2 abc = Singleton2.getInstance();
        Singleton2 bcd = Singleton2.getInstance();

        System.out.println(abc==bcd);

    }
}