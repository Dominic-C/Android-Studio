package com.example.week1.Iterators;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String [] args)
    {
        List<Integer> ls = new ArrayList<Integer>();
        ls.add(1);
        ls.add(2);
        ls.add(3);

        int total = Iterators.collectionsIterator(ls); // sum by iterator
        int total2 = Iterators.forEachIterator(ls); // sum by for each loop
    }
}
