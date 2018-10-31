package VisitorEx2;

public class Necessity implements Visitable {

    private double price;

    Necessity(double item)
    {
        price = item;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public double accept(Visitor v) {
        return v.visit(this);
    }
}
