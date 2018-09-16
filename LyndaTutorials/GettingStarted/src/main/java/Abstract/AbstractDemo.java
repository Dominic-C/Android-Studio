package Abstract;

public class AbstractDemo {

    public static void main(String [] args)
    {
//        SpecialPhone obj = new SpecialPhone(); // cannot create objects of abstract class
//        obj.call();

        SpecialPhone obj = new finalUpdate(); // I think it's something called abstraction. have to read up more on this
        obj.call();
        obj.explode();
        obj.move();
        obj.selfCharge();
    }

}

abstract class SpecialPhone // as long as a class contains an abstract method, we call it an abstract class
{
    public void call()
    {
        System.out.println("Calling...");
    }

    // abstract methods are methods that are declared but not defined

    public abstract void move(); // don't provide the implementation
    public abstract void explode();
    public abstract void selfCharge();

}

/*Other classes can inherit from SpecialPhone and define it's abstract methods */
abstract class firstUpdate extends SpecialPhone
{
    public void move() {
        System.out.println("Phone moved!!");
    }

    public void explode() {
        System.out.println("Oh no! I'm using a note 7! ITS GONNA EXPLODE!");
    }
}

class finalUpdate extends firstUpdate // becomes a concrete class
{
    public void selfCharge()
    {
        System.out.println("The phone is charging itself! Infinite energy!");
    }
}