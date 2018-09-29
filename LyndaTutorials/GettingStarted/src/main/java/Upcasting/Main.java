package Upcasting;

public class Main {

    public static void main(String [] args)
    {
        Dog dog = new Dog();

        // upcasting - casting a subtype into a supertype
        /*Upcasting is always a safe operation, as we treat a type
        * to a more general one */
        Animal anim = (Animal) dog;
        anim.eat();

        Mammal mam = new Cat();
        Animal animal = new Dog();
        mam.move();
        animal.eat();

        /*Down casting
        * Casting a to a subtype*/
        Animal anim2 = new Cat();
        Cat cat = (Cat) anim2;
        cat.move();

    }
}
