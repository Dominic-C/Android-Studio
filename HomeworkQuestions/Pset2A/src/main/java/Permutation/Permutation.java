package Permutation;

import java.util.ArrayList;
import java.util.Arrays;

public class Permutation {
    private final String in;
    private ArrayList<String> a = new ArrayList<String>();
    // additional attribute if needed
    private char [] inputArray;
    private static int j = 0;

    Permutation(final String str){
        in = str;
        // additional initialization if needed
        inputArray = in.toCharArray();

    }

    public void permute(){
        // produce the permuted sequence of 'in' and store in 'a', recursively

        /*logic:
        * static int j = 0;
        *
        * for(int i = j; i < inputArray.length ; i++)
            {
                swap(inputArray,j,i);
                j++;
                --j;
                swap(inputArray,j,i);
            }

        what this does is swap i and j, but its useless if i and j are of the same index.
        So, what we want to do is make a permutation call to make i and j different.
        we add in permute() between the j++ and --j statements to achieve this.

        for the first call, we are going to swap i=0 and j=0. We increment j by 1 and call permute.
        Calling permute checks if j == array.length-1. this means we have reached the end of the swapping sequence

        *
        *
        * */

        if(j == inputArray.length -1)
        {
            String answer = "";
            for(char c: inputArray)
            {
                answer+= c;
            }
            if(a.contains(answer) == false)
            {
                a.add(answer);
            }
        }

        else
        {
            for(int i = j; i < inputArray.length ; i++)
            {
                swap(inputArray,j,i);
                j++;
                permute();
                --j;
                swap(inputArray,j,i);
            }
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