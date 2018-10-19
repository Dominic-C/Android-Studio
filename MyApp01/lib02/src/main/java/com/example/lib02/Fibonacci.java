package com.example.lib02;

public class Fibonacci {

    public static String fibonacci(int n)
    {
        int f1 = 0;
        int f2 = 1;

        String ans = f1 + "," + f2;

        for (int i=3; i <= n; i++)
        {
            int tmp = f1 + f2;
            f1 = f2;
            f2 = tmp;

            ans = ans + "," + tmp;

        }

        System.out.println(ans);
        return ans;

    }

    public static void main(String [] args)
    {
        fibonacci(5);
    }
}
