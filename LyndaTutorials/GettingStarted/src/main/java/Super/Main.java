package Super;

import Interfaces.Pet;

public class Main {

    public static void main(String [] args)
    {
        A obj1 = new A();

        System.out.println("\n\n===== create B object =======\n");

        B obj2 = new B();

        System.out.println("\n\n===== create B obj with arguments =======\n");

        B obj3 = new B(123);
    }
}
