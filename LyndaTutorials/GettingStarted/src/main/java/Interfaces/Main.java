package Interfaces;

// interfaces forces classes and objects to have certain properties without forcing how it's implemented

import java.util.Random;

public class Main {

    public static void main(String [] args)
    {
        Cat cat = new Cat();
        Dog dog = new Dog();

        if (cat instanceof Pet)
        {
            System.out.println(cat.play());
        }

        if (dog instanceof Pet)
        {
            System.out.println(dog.play());
        }

        // we can also generate random classes that use the interface Pet
        Pet p;
        Random rand = new Random();
        int n = rand.nextInt(2); // random number inclusive of 0 and 1

        if (n == 0)
        {
            p = new Cat(); // allocating Cat class to Pet interface object
        }

        else
            p = new Dog();

        System.out.println("Play with random animal: " + p.play());
    }
}
