package Super;

public class B extends A{
    // actually calls the constructor of A here. ie. A();

    // calls constructor of superclass then subclass. NOTE: calls DEFAULT constructor of super class
    public B()
    {
        System.out.println("in B");
    }

    public B(int i)
    {
        super(i);
        System.out.println("In B int");
    }
}
