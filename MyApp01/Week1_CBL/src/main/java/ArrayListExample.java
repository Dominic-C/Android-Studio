import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class ArrayListExample {

    public static void main(String [] args)
    {
//        ArrayList<Integer> w = new ArrayList<Integer>(); // array list
//        LinkedList<Integer> w = new LinkedList<Integer>(); // linked list
//        // <> means generic, i.e type of ____
//        // Integer is a class, storing references to integer objects
//        // Int is a primitive type, storing actual binary value for the integer we want to represent
//
//        //https://stackoverflow.com/questions/8660691/what-is-the-difference-between-integer-and-int-in-java
//        w.add(100);
//        w.add(200);
//
//        w.remove(0); // removes entries at a particular index
//        w.add(300);
//
//        System.out.println(w.get(1)); // return value at index
//
//        w.set(1, 200); // replace value at index 1 with 200
//
//        System.out.println(w.get(1));


        // comparing arrays to arraylist
        // convert arrays to list by .asList
        Integer [] a = new Integer[5000000];

//        LinkedList<Integer> x = new LinkedList<Integer>(Arrays.asList(a)); // create a linked list
        ArrayList<Integer> x = new ArrayList<Integer>(Arrays.asList(a));

        int cnt = 5000;
        long timeStarted = System.nanoTime();

        for (int i = 0; i < cnt ; i ++)
        {
//            x.add(100,2500000);
            x.set(2500000, 12);

        }

        long duration = System.nanoTime() - timeStarted;

        System.out.println("time taken " + duration / 1000000 + " ms");


    }
}
