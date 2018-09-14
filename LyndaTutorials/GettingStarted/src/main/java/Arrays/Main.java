package Arrays;

import java.lang.reflect.Array; // to get access to Array class's static methods
import java.util.Arrays; // get access to Arrays class sort static method

public class Main {
    public static void main(String [] args)
    {
        // 31, 45, 22, 98, 10
        int [] numbers = new int[5]; // allocates 5 slots for the array, cannot change or alter array, but can edit contents

        // adding values to the array
        numbers[0] = 31;
        numbers[1] = 45;
        //.....

        int [] numbers2 = {31, 45,22, 98, 10};

        String [] myFavCandy = {"Twix", "Hershey's", "Kitkat"};

        int candyLength = myFavCandy.length;

        // use .get method from the Array class in java's libraries
        Array.get(myFavCandy, 2); // choose array then index
        System.out.println(Array.get(myFavCandy, 2));

        Arrays.sort(numbers); // mutates numbers array
        System.out.println(numbers); // prints out memory address because we are printing a memory address. Arrays are a reference type
        System.out.println(Arrays.toString(numbers)); // prints out array as string
    }
}
