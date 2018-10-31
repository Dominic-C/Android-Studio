package PsetRevision.Pset1A;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iteratorr {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>(); // lists, ArrayLists, Linked Lists are ordered
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);

        System.out.println("while loop:");
        iteratorWhileLoop(l1);
        System.out.println("For each:");
        iteratorForEach(l1);
    }

    public static void iteratorWhileLoop(List<Integer> l)
    {
        // create an iterator
        Iterator<Integer> itr = l.iterator();
        int sum = 0;
        while(itr.hasNext())
        {
            sum += itr.next();
        }
        System.out.println(sum);
    }

    public static void iteratorForEach(List<Integer> l)
    {
        int sum = 0;
        for(Integer i : l)
        {
            sum += i;
        }
        System.out.println(sum);
    }
}
