package FinalRev;

public class Pond2Builder {
    private double size;
    private String type;

    public Pond2Builder setSize(double size) { // setters
        this.size = size;
        return this;
    }

    public Pond2Builder setType(String type) { // setters
        this.type = type;
        return this;
    }

    public Pond2 createPond2() {
        return new Pond2(size, type);
    } // create an instance
}