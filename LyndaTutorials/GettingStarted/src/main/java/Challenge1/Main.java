package Challenge1;

public class Main {

    public static void main(String [] args)
    {
        Dog buddy = new Dog("BUDDY", 2);

        buddy.poop();
        System.out.println("Rollover count: " + buddy.getRollOverCount());

        buddy.rollOver();

        System.out.println("Rollover count: " + buddy.getRollOverCount());

        buddy.bark();


    }
}
