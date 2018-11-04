package fibonacciRecursion;

public class fibonacci { // finding the nth number of fibonacci sequence
    public int fibonacciOf(int n)
    {
        if(n == 1 || n == 0)
        {
            return n;
        }
        int newint1 = n-1;
        int newint2 = n-2;
        // nth number in fibonacci sequence is the n-1 and n-2 sequence of fibonacci sequence
        return fibonacciOf(newint1) + fibonacciOf(newint2);
    }
}

class Main
{
    public static void main(String[] args) {
        fibonacci fibs = new fibonacci();
        System.out.println(fibs.fibonacciOf(3));
    }
}
