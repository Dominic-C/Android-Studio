package Visitor;

public class CD implements Visitable {

    private double cost = 0;

    CD(double cost)
    {
        this.cost = cost;
    }

    double getCost()
    {
        return this.cost;
    }

    @Override
    public void accept(Visitor v) { // public allows other methods to call this function
        v.visit(this);
    }
}
