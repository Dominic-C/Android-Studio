package com.example.week1;

public class PrimeNumberChecker {

    public static int isPrime (int n)
    {
//        int i = 0;
        // as long as i have a non zero, and the base is not n
        for(int nums = 2; nums < n; nums++)
        {
            // if prime divisible, not a prime, return or break
            if (n % nums == 0)
            {
                System.out.println(n + " is divisible by "  + nums + ", not a prime number");
                return 0;
            }

            // if prime is not divisible, add and check again
        }

        System.out.println(n + " is a prime number!");
        return 1;
    }

    public static void main(String[] args)
    {
        isPrime(99);
    }
}
