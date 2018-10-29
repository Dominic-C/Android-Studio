package Fibonacci;

public class FibonacciForLoop {

    public static void fibonacciForLoop(int n)
    {
        int firstTerm = 0;
        int secondTerm = 1;

        String ans = firstTerm + ", " + secondTerm;
        for(int i = 2; i < n; i++)
        {
            int tmp = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = tmp;

            ans = ans.concat(", " + tmp);
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        fibonacciForLoop(6);
    }
}
