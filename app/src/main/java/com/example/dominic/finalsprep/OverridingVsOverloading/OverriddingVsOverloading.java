package com.example.dominic.finalsprep.OverridingVsOverloading;

public class OverriddingVsOverloading {
    public static void main(String[] args) {
        // Given Hound h = new Hound()
        Hound h = new Hound();
        System.out.println("Hound h = new Hound()");
        h.bark();
        h.drool(1); // with parameter version is an overloaded function
        h.drool();
        h.sniff();

        // Dog g = new Hound()
        Dog g = new Hound();
        System.out.println("Dog g = new Hound()");
        g.bark(); // uses Hound's methods instead of Dog's method
        // g.drool(1); gives error because the method does not exist for dog
        g.drool(); // when Hound does not have a method, it will use the parent class methods
        // g.sniff(); method does not exist for dog
    }
}

class Dog{
    public void bark(){
        System.out.println("woof");
    }
    public void drool()
    {
        System.out.println("drool");
    }
}

class Hound extends Dog{
    public void sniff(){
        System.out.println("sniff");
    }
    @Override public void bark()
    {
        System.out.println("growl");
    }
    public void drool(int time) // overloading the drool method
    {
        System.out.println("drool "+ time);
    }
}
