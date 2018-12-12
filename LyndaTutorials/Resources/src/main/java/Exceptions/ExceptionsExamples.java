package Exceptions;

public class ExceptionsExamples {
    public static void main(String[] args) {
        try{
//            int a = quotientInt(5,0);
            double b = quotientDouble(5,0);
            System.out.println(b); // b is infinity
        }
        catch (ArithmeticException ex)
        {
            ex.printStackTrace();
        }
    }

    public static int quotientInt(int a, int b)
    {
        return a/b;
    }

    // double will not activate catch block. Why?
    public static double quotientDouble (double a, double b) throws ArithmeticException
    {
        if(Math.abs(b) <= 1e-10) throw new ArithmeticException("Cannot Divide by zero.");
        return a/b;
    }
}
