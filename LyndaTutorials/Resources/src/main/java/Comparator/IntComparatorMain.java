package Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class IntComparatorMain { // in comparators, we require a separate class to contain our compare method. This is different from comparable.
    /*
    * In comparator, we can compare the individual attributes of an object, i.e sorting by radius, sorting by color
    * */

    public static void main(String [] args)
    {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(-10);
        l.add(-100);
        l.add(2);

        Collections.sort(l); // sorts by default compare method
        System.out.println(l);

        Collections.sort(l, new IntegerAbsComparator()); // sorts by user defined compare method
        System.out.println(l);
    }
}
