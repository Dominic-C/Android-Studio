package Interfaces;

public class Cat implements Pet {
    public String play() {
        return "Cat does'nt play with it's owner because it's a cat.";
    }

    @Override
    public void sit() {

    }
}
