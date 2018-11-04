package Q5;

import java.util.*;

public class TestStronglyConnected2 {
    public static void main (String[] args){
        int nodecount=5;
        int linkcount=5;
        ArrayList<Integer> listOfLink = new ArrayList<Integer> ( Arrays.asList(0,1,  1,2,  2,3,  3,4,  4,0));
        System.out.println(StronglyConnected.testStronglyConnected(nodecount, linkcount, listOfLink));
    }
}
