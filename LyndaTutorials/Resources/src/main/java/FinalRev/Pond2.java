package FinalRev;

public class Pond2 {

    private double size;
    private String type;

    Pond2(double size, String type) // builder class generated
    {
        this.size = size;
        this.type = type;
    }

    private static Pond2 createPond2(double size, String type) { // Factory method
        return new Pond2Builder().setSize(size).setType(type).createPond2();
    }

}
