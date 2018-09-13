import java.util.*;

public class Collections {

    // in an array, you usually need to define a size
    // in a collection, it allocates space dynamically.

    public static void main(String [] args)
    {
        String [] things = {"eggs" , "Lasers", "hats", "people"}; // an array of strings
        List<String> list1 = new ArrayList<String>(); // list that is blank

        // for each loop
        for (String x : things) // for each string x in things
        {
//            System.out.println(x);
            list1.add(x);
        }


        String [] morethings = {"eggs" , "Lasers"};
        List<String> list2 = new ArrayList<String>();

        for (String y: morethings)
        {
            list2.add(y);
        }

        // print out list
        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2);

        editList(list1, list2);

        System.out.println("\nAfter editList \n");

        System.out.println("List1: " + list1);

    }

    public static void editList(Collection<String> L1, Collection<String> L2)
    {
        // Iterator<String> -- we want to go through string data
        Iterator<String> it = L1.iterator(); // create an iterator in L1. .iterator is a method of the collections class
        while(it.hasNext()) // while there is a next item in iterator
        {
//            System.out.println("Iterator.next: " + it.next());
            if(L2.contains(it.next())) // if L2 contains the item in iterator.next()
                it.remove();
        }
    }
}
