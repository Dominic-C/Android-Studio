package Collections;

import java.net.ConnectException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/*contains the following topics in java
*
* Collection interface
* Generics
* List interface
* */

public class CollectionsDemo {
    // connection is an interface, there are already certain classes that implements the collection interface
    public static void main(String[] args)
    {
        Collection values = new ArrayList(); // or we can use ArrayList at the start..
        values.add(3);
        values.add("Dom");
        values.add(5.8f);

        // Getting values
        // 1. iterators
        // 2. enhanced for loop

        // Iterators
        Iterator i = values.iterator(); // value object has method called iterator

        // Printing out values in the list
//        System.out.println(i.next());
//        System.out.println(i.next());
//        System.out.println(i.next());

        // if we dont know the number of elements but we want to do an iterative printing
        Iterator j = values.iterator();

//        while(j.hasNext())
//        {
//            System.out.println(j.next());
//        }

        // Enhanced for loop
//        for (Object k : values)
//        {
//            System.out.println(k);
//        }

        // if i want to allow only certain data types into the array. I can use generics
        Collection<Integer> newvalues = new ArrayList<>();
        newvalues.add(32);
        newvalues.add(3);
        newvalues.add(2);

        // Lists. Lists extends collection, so it has some extra features compared to collection
        List<Integer> value2 = new ArrayList<>();
        value2.add(2);
        value2.add(4);
        value2.add(6);

        // adding numbers into the list
        value2.add(1,100);

        // for sorting of elements, use List
        Collections.sort(value2);
//        for(int a : value2)
//        {
//            System.out.println(a);
//        }

        // Getting and setting values at a particular index
        System.out.println(value2.get(1));

        value2.set(1,200);
        System.out.println(value2.get(1));

        value2.remove(1);
        System.out.println(value2.get(1));

    }

}
