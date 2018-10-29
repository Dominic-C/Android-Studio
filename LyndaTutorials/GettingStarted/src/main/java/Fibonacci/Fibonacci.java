package Fibonacci;

import java.util.ArrayList;
import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        fibonacci(8);
    }

    public static void fibonacci(int n)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        if(n == 0)
        {
            System.out.println(ans);
        }
        if(n == 1)
        {
            ans.add(1);
            System.out.println(ans);
        }
        else{
            ans.add(1);
            ans.add(1);
            for(int i = 2; i < n; i ++)
            {
                ans.add(ans.get(i-2)+ans.get(i-1));
            }
            System.out.println(ans);
        }

    }
}
