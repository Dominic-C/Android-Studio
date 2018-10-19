package com.example.lib02;
// week 1 lesson 2

public class MyClass {

    public static int add(int x, int y)
    {
        return x + y;
    }

    public static void main(String [] args)
    {
        System.out.println("Hello from main");

        // variable

        int a = 1;

        double x = 2.3;

        int [] b;
        b = new int[20]; // create bandwidth to store data
        // new creates a new object and passes it by reference to b
        b[2] = 34;
        b[4] = 4;

        // string array
        String [] w = new String[20];

        w[0] = "first string";

        // Strings
        // string s is an object
        String s = "Hi hi";
        System.out.println(s.length());

//        if then else

        int t = 10;
        if ( t > 20)
        {
            System.out.println("Case 1");
        }
        else if (t > 30)
        {
            System.out.println("Case 2");
        }
        else
        {
            System.out.println("Too small");
        }

//        loop

        for (int i = 0; i < 20; i++)
        {
            System.out.println(i);
        }

    }
}
