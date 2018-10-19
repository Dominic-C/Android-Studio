package Visitor;

public class PackagingCostVisitor implements Visitor {

    private double total = 0;

    @Override
    public void visit(Book b) {
        total += b.getWeight() * 5;
    }

    public void visit(CD c)
    {
        total += c.getCost();
    }

    public double getTotal()
    {
        return this.total;
    }
}
