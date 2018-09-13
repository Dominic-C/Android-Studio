package com.example.week1;

import java.util.*;

public class Iterators {

    public static int collectionsIterator(List<Integer> list) // had to make it static to run without an instance. Did not create an object
            // if i were to create an object from this method, i would not have the static modifier. Just look at the parent class "Iterators" above.
            // i need to create an instance of iterators to run this program, so it does not have static.
    {
        // make an integer iterator for L1
        Iterator<Integer> it = list.iterator();
        int sum = 0;
        while(it.hasNext())
            sum += it.next();

        return sum;
    }

    public static int forEachIterator(List<Integer> list2)
    {
        int sum2 = 0;
        for (int x : list2) // for each x in list, iterates over the list collection
        {
            sum2 += x;
        }
        return sum2;
    }

    public static void main(String [] args)
    {
        List<Integer> ls = new ArrayList<Integer>();
        ls.add(1);
        ls.add(2);
        ls.add(3);

        int total = collectionsIterator(ls); // sum by iterator
        int total2 = forEachIterator(ls); // sum by for each loop
    }
}
