package Q4;

public class Fib {

    public static void main(String[] args) {
        System.out.println(recurFib(3));
        System.out.println(recurFib(5));
        System.out.println(recurFib(10));
    }

    public static int recurFib(int idx) {
        //TODO
        {
            if (idx == 1 || idx == 0) {
                return idx;
            }
            int newint1 = idx - 1;
            int newint2 = idx - 2;
            // nth number in fibonacci sequence is the n-1 and n-2 sequence of fibonacci sequence
            return recurFib(newint1) + recurFib(newint2);

        }
    }
}

