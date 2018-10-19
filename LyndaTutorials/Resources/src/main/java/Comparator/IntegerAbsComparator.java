package Comparator;

import java.util.Comparator;

public class IntegerAbsComparator implements Comparator<Integer> { // this class is to be passed as an argument

    public int compare(Integer a, Integer b)
    {
        return Math.abs(a) - Math.abs(b);
    }
}
