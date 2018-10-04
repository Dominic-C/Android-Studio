package com.example.hackerrank;


import java.util.Arrays;
import java.util.Scanner;

public class MyClass {
    public static void main(String [] args)
    {
        Scanner n = new Scanner(System.in);
        int inpstr = n.nextInt();

        for(int i = 0; i < inpstr; i++)
        {
            String inputString = n.next();
            String even = "", odd= "";
            for(int j = 0; j < inputString.length(); j++)
            {
                if(j%2 == 0)
                {
                    even += inputString.charAt(j);
                }
                else
                    odd += inputString.charAt(j);
            }
            String output = even + " " +  odd;


            System.out.println(output);
        }

    }
}
