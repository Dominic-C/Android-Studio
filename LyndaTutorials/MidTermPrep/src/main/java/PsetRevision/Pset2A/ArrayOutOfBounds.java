package PsetRevision.Pset2A;

public class ArrayOutOfBounds {
    public static void main(String[] args) {
        String [] in = {"hello", "goodnight", "good morning"};
        String ret = tstException(2, in);
        System.out.println(ret);
        ret = tstException(-1, in);
        System.out.println(ret);
    }

    public static String tstException(int index, String[] y)
    {
        String message;
        try{
            message = y[index];
        }

        catch (ArrayIndexOutOfBoundsException e)
        {
            message = "Out of Bounds";
        }
        return message;
    }
}
