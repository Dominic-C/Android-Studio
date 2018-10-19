package Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Main { // in comparable, we define the compareTo method inside the circle class.
    /*
    * This means that there is one way to compare the objects.
    * */

    public static void main (String [] args)
    {
        ArrayList<Circle> myList = new ArrayList<>();
        myList.add(new Circle(23.1));
        myList.add(new Circle(3.1));
        myList.add(new Circle(4.5));

        Collections.sort(myList);

        for(Circle c : myList)
        {
            System.out.println(c);
        }
    }
}
