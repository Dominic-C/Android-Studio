package Singleton;

public class Singleton {
    private static Singleton instance = null;

    public String s;

    private Singleton()
    {
       s = "Hello, i am a string part of the singleton class!";
    }
    public static Singleton getInstance()
    {
        // if statement is an added on feature that checks if there is already an instance
        if(instance == null)
        {
            instance = new Singleton();
        }
        return instance;
    }
}

class Main
{
    public static void main(String[] args) {
        Singleton x  = Singleton.getInstance();

        System.out.println(x.s);
    }
}
