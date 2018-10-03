package ExceptionHandling;

public class ThrowsDemo {

    public static void main (String [] args) throws ArrayIndexOutOfBoundsException
    {
        int [] array = new int[3];
        for(int i = 0; i <=3; i++)
        {
            array[i] = i*3;
        }
        System.out.println("Hi");
    }
}
