package com.example.lib02;

public class staticMethods {
    // instantiation, doing "new" to create an object
    private static int fishcount = 0;
    private String Species;

    staticMethods(String fishSpecies)
    {
        fishcount++;
        Species = fishSpecies;
    }

    String getSpecies()
    {
        return this.Species;
    }

    public static int getFishcount()
    {
        return fishcount;
    }

    public static void main(String [] args)
    {
        // for static methods, we have to supply object references
        staticMethods f1 = new staticMethods("guppy");
        staticMethods f2 = new staticMethods("tetra");

        System.out.println("The pond has "  + getFishcount() + " fishes."); // static variables are shared between objects
        System.out.println("The first fish added was a " + f1.getSpecies()); // notice how we can call a non static method if we have an instance of the staticMethods class?
    }
}
