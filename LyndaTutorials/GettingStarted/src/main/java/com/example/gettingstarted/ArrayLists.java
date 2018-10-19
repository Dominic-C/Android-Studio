package com.example.gettingstarted;
import java.util.ArrayList;

public class ArrayLists {
    // dynamically created
    public static void main(String[] args)
    {
        int simple_array[] = new int[5]; // simple arrays require programmer to specify size beforehand

        ArrayList<Integer> myList = new ArrayList<Integer>(5); // creates dynamically allocated array with starting size of 5
        myList.add(1);
        myList.add(5);
        myList.add(325);

        for (Integer x : myList)
        {
            System.out.println(x);
        }

        // size of array
        System.out.println("Size = " + myList.size());
    }
}
