package com.example.lib02;

import java.util.*;

public class IteratorsForEach {

    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<Integer>(); // collections must be inside a method
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int sum = 0;
        for (int x : list) // for each x in list, iterates over the list collection
        {
            sum += x;
        }
        System.out.printf("%d", sum);

        // new method introduced in jdk8
        // collections has a forEach method. takes in a "lambda expression", but not supported here
//        list.forEach(p -> System.out.println(p));

    }


}
