package com.example.lib02;

import java.util.*;

public class Iterators {

    public static int findSum(List<Integer> L1)
    {
        // make an integer iterator for L1
        Iterator<Integer> it = L1.iterator();
        int sum = 0;
        while(it.hasNext())
            sum += it.next();

        return sum;
    }

    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        System.out.println(findSum(list));
    }
}
