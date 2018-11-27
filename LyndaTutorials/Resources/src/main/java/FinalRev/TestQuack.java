package FinalRev;

// access quack!
public class TestQuack {
    public static void main(String[] args) {
        Pond.Duck duck = new Pond.Duck(); // need to instantiate a new duck object without creating a Pond object
        System.out.println(duck.quack);
        System.out.println(new Pond.Duck().quack);

        int i = duck.quack;
        int j = new Pond.Duck().quack;
    }
}

class Pond{

    static class Duck{
        int quack = 111;
    }

}