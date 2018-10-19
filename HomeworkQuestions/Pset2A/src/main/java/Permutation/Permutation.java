package Permutation;

import java.util.ArrayList;
import java.util.Arrays;

public class Permutation {
    private final String in;
    private ArrayList<String> a = new ArrayList<String>();
    // additional attribute if needed
    private char [] storearray;
    private char [] initialentry;






    Permutation(final String str){
        in = str;
        // additional initialization if needed
        a.add(in);
        initialentry = in.toCharArray();
        storearray = in.toCharArray();


    }

    public void permute(){
        // produce the permuted sequence of 'in' and store in 'a', recursively

        for(int i = 0; i < in.length()-1; i++)
        {
            swap(storearray, i, i + 1);
            System.out.println(Arrays.toString(storearray));
//            if(Arrays.equals(storearray, initialentry) == false)
//            {
//                permute();
//            }

        }
//        swap(storearray, 0,in.length()-1);
//        System.out.println(Arrays.toString(storearray));
//        if(Arrays.equals(storearray, initialentry) == false)
//        {
//            permute();
//        }
        if(Arrays.equals(storearray, initialentry) == false)
        {
            permute();
        }



    }

    public void swap(char [] chararray, int a, int b)
    {
        char tmp = chararray[a];
        chararray[a] = chararray[b];
        chararray[b] = tmp;
    }
    public ArrayList<String> getA(){
        return a;
    }
}