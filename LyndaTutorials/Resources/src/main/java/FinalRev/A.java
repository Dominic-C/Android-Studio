package FinalRev;

// what is wrong with this code?
public class A {
    String s = "AA";

    void MethodA()
    {
        System.out.println(s);
    }

    static class B
    {
        void MethodB()
        {
//            MethodA(); // Method must be static because it is called without an instance of class A
        }
    }
}
