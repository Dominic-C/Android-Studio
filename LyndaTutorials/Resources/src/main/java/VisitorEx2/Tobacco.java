package VisitorEx2;

public class Tobacco implements Visitable {

    private double price;

    Tobacco(double item)
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
