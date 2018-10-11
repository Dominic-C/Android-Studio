package Visitor;

public class Book implements Visitable {

    private double weight;
    public Book (double weight)
    {
        this.weight = weight;
    }

    public void accept (Visitor v)
    {
        v.visit(this);
    }

    public double getWeight()
    {
        return this.weight;
    }


}
