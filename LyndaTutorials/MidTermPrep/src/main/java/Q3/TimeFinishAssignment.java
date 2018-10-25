package Q3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TimeFinishAssignment {
    static int worker1 = 0;
    static int worker2 = 0;
    static int worker3 = 0;

    public static void main(String[] args) {
        ArrayList<Integer> listOfAssignment = new ArrayList<>();
//        listOfAssignment.add(6);
//        listOfAssignment.add(7);
//        listOfAssignment.add(8);
//        listOfAssignment.add(9);
//        listOfAssignment.add(10);
        // test case 2
//        listOfAssignment.add(3);
//        listOfAssignment.add(4);
//        listOfAssignment.add(3);
//        listOfAssignment.add(5);
//        listOfAssignment.add(6);
//        listOfAssignment.add(2);
//        listOfAssignment.add(9);
//        listOfAssignment.add(2);
        listOfAssignment.add(30);


        System.out.println(computeTimeFinish(listOfAssignment));
        // output: 15

    }



    public static int computeTimeFinish(ArrayList<Integer> l) {
       // TODO: implement computeTimeFinish method
        if(l.size() == 0)
        {
            return Math.max(worker1, Math.max(worker2, worker3));
        }

        else{
            Collections.sort(l);
            int smallest = Math.min(worker1, Math.min(worker2, worker3));
            // add to the smallest
            if(worker1 == smallest){
                worker1+=l.get(l.size()-1);
                l.remove(l.size()-1);
            }
            else if (worker2 == smallest)
            {
                worker2+=l.get(l.size()-1);
                l.remove(l.size()-1);
            }
            else
            {
                worker3+=l.get(l.size()-1);
                l.remove(l.size()-1);
            }
            return computeTimeFinish(l);
        }
    }



}
