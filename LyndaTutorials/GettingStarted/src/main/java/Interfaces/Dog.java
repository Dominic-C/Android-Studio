package Interfaces;

public class Dog implements Pet{ // Dog class must have a play() method
    public String play() // has implementation of play method, so will not have error
    {
        return "Dog plays with it's owner.";
    }

    @Override // Override is to indicate that the method is a specific implementation of the methods in the super class
    public void sit() {

    }
}
