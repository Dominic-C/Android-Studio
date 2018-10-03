package Upcasting;


public abstract class Animal implements Mammal {

    public void eat()
    {
        System.out.println("Eating...");
    }

    public void sleep()
    {
        System.out.println("Sleeping....");
    }

    public void move()
    {
        System.out.println("Moving");
    }

}