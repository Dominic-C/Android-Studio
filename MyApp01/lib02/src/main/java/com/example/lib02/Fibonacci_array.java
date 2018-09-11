package com.example.lib02;

public class Fibonacci_array
{
    public static String counts(int n)
    {
        String ans = "0,1";
        int [] array;
        array = new int[n];
        for (int i =0; i < n; i++)
        {
            if (i == 0)
            {
                array[0] = 0;
//                System.out.println("0");
            }
            if (i == 1)
            {
                array[1] = 1;
//                System.out.println("1");
            }
            if (i > 1) // i when it's value is 2 and above
            {
                array[i] = array[i-2]+array[i-1];// new number is the sum of the previous two numbers
                ans = ans + "," + array[i];
//                System.out.println(array[i-2]+array[i-1]);
            }

        }
        return ans;
    }

    public static void main(String [] args)
    {
        String answer = counts(5);
        System.out.println("Result is: " + answer);
    }
}