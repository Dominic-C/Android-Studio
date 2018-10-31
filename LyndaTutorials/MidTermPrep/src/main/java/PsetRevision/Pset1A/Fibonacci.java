package PsetRevision.Pset1A;

public class Fibonacci {

    public static void main(String[] args) {
        String fiboseq = fibonacciGenerate(5);
        System.out.println(fiboseq);
    }

    public static String fibonacciGenerate(int n) // Method is static because we want to call it without making an instance of it.
    {
        int i1 = 0;
        int i2 = 1;

        String ans = i1 + ", " + i2;
        for(int i = 2; i < n; i++)
        {
            int sum = i1 + i2;
            i1 = i2;
            i2 = sum;

            ans = ans.concat(", ");
            ans = ans.concat(Integer.toString(sum));
        }
        return ans;
    }
}
