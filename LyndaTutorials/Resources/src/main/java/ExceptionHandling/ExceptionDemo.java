package ExceptionHandling;

// Exception can be handled
/*
* Statements - normal (no problems)
*           - critical (might have problems) eg int k = i/j, j might be 0.
*           - critical statements should be written in blocks - try blocks
*                   in the try blocks, if any exception is found, it will be "Thrown"
*                   we must then use a catch block to catch the thrown exception
*
*                   examples: - trying to open a file that is not available
*                              - dividing by zero
*
*                   different catches for different types of exceptions thrown
*
*                   If we don't know the type of exception, we can use a class "Exception"
*
*   Checked and unchecked exception
*   Checked
*   - allow user to handle this exception? (IOException)
*
*   Unchecked
*   - if user cannot handle this exception (runtimeException)
*/
// Errors cannot be handled - physical components, cpu not working properly, not enough ram etc

public class ExceptionDemo {

    public static void main(String [] args)
    {
        // Throwable class are extended by exception and error.
        int i, j, k=0;
        int a [] = new int [4];
        i =8;
        j =2;

        try{
            k = i/j; // critical statement, not sure if this will throw error

            for(int c = 0; c <=4; c++) {
                a[c] = c + 1;
                System.out.println(a[c]);
            }

        }

        catch (ArithmeticException e)
        {
            System.out.println(e);
            System.out.println("Cannot divide by Zero");
        }

        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Maximum number of entries in Array Exceeded");
        }

        catch (Exception e) // if we place this exception before the other exceptions, we will get an error. Due to redundancy
        {
            System.out.println("Unknown exception");
        }

        finally
        {
            // this block should ALWAYS be executed irregardless of an exception
            System.out.println("In the finally block");
        }

        System.out.println("After the finally block");

    }
}
