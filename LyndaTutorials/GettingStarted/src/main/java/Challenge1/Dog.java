package Challenge1;

public class Dog {
    String name = "Doggo";
    int age = 2;
    private int rollOverCount = 0; // safer, can only access through class instance

    public Dog(String inputName, int inPutAge)
    {
        this.name = inputName;
        this.age = inPutAge;
    }

    public void bark()
    {
        System.out.println("Woof Woof!");
    }

    public void rollOver()
    {
        this.rollOverCount++;
    }

    public int getRollOverCount()
    {
        return this.rollOverCount;
    }

    public void poop()
    {
        System.out.println("Oh no! "+ this.name + " pooped on the floor!");
    }
}
