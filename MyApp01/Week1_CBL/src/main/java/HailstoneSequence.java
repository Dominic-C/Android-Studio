import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;

public class HailstoneSequence {

    public static ArrayList<Integer> sequence (int n)
    {
        ArrayList<Integer> array = new ArrayList<>();
//        array.add(n);

        // while result not 1

//        int result = n;
//        while(result != 1)
//        {
//            if (n % 2 == 0) // even
//            {
//                array.add(n / 2);
//                result = n / 2;
//            } else {
//                array.add(3 * n + 1);
//                result = 3 * n + 1;
//            }
//        }
//        return array;
        array.add(n);
        while(n != 1)
        {
//            array.add(n);
            if(n%2 == 0)
            {
                n = n/2;
            }
            else
            {
                n = 3*n + 1;
            }
            array.add(n);
        }

        return array;

    }

    // For eacj

//    public static void foreachloop (int n)
//    {
//        // for each
//        // w is an array
//        for (int x : w)
//    }

    // iterator

//    Iterator<Integer> iter = w.iterator();
//
//    mySum = 0;
//
//    while (iter.hasNext())
//        mySum += iter.next(); // advances the pointer as well.


    public static void main(String [] args)
    {


        String a = args[0];
        int y = Integer.parseInt(a);

        // arg parser later on
        System.out.println(sequence(5));

    }
}
