package PsetRevision.Pset1A;

public class PrimeChecker {
    public static void main(String[] args) {
        System.out.println(isPrime(4));
        System.out.println(isPrime(7));
        System.out.println(isPrime(14));
        System.out.println(isPrime(23));
        System.out.println(isPrime(99));
    }
    /*

Here is an algorithm for determining whether or not a number is prime.

    Is the number less than 2? If so, return false.
    Is the number 2 or 3? If so, return true.
    Is the number 4? If so, return false.
    Take the square root of the number, rounded up to the next integer. This is optional for small prime numbers, but speeds up the determination for larger numbers.
    Loop from 2 to the square root of the number (or the number), incrementing by 1.
        Divide the loop number by the prime numbers determined so far.
        If the modulus of the division is zero, return false.
    If the loop is completed, return true.

*/
    public static boolean isPrime(int n)
    {
        if(n == 3)
            return true;
        else{
            for(int i = 2; i < n; i++)
            {
                if(n%i == 0)
                    return false;
            }

            return true;
        }
    }
}
