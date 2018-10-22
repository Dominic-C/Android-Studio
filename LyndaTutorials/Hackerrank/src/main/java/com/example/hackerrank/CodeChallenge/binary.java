package com.example.hackerrank.CodeChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*convert a decimal to a binary then print the max number of consecutive 1's*/

public class binary {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        ArrayList<Integer> ans = new ArrayList<>();
        while (n>0)
        {
            ans.add(n%2);
            n = n/2;
        }
        Collections.reverse(ans);


        // to convert into binary
//        String output = "";
//        for(Integer i : ans)
//        {
//            output+=i;
//        }

        int max_ones = 0;
        int tmp_ones = 0;
        int consecutive_ones = 0;
        for(int i = 0; i < ans.size(); i++)
        {
            if(ans.get(i) == 1 && tmp_ones == 0)
            {
                tmp_ones++;
//                consecutive_ones++;
            }
            if(ans.get(i)== 0)
            {
                tmp_ones = 0;
                consecutive_ones = 0;
            }
            if(tmp_ones == 1 && ans.get(i) == 1)
            {
                consecutive_ones++;
            }
            if(consecutive_ones > max_ones)
            {
                max_ones = consecutive_ones;
            }
            // if temp ones > max ones, max ones = temp ones
        }

        System.out.println("max ones = " + max_ones);

        scanner.close();
    }
}
