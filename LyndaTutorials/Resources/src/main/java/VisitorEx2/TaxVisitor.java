package VisitorEx2;

import java.text.DecimalFormat;
public class TaxVisitor implements Visitor{

    // extra touch up
    private DecimalFormat df = new DecimalFormat("#.##");

    // create constructor
    public TaxVisitor()
    {

    }

    @Override
    public double visit(Liquor liquorItem) {
        System.out.println("Liquor Item: Price with tax");
        double total = liquorItem.getPrice() * 0.18 + liquorItem.getPrice(); // we get price from initialized objects
        return Double.parseDouble(df.format((total)));
    }

    @Override
    public double visit(Tobacco tobaccoItem) {
        System.out.println("Tobacco Item: Price with tax");
        double total = tobaccoItem.getPrice() * 0.42 + tobaccoItem.getPrice(); // we get price from initialized objects
        return Double.parseDouble(df.format((total)));
    }

    @Override
    public double visit(Necessity necessityItem) {
        System.out.println("Necessity Item: Price with tax");
        double total = necessityItem.getPrice() * 0 + necessityItem.getPrice(); // we get price from initialized objects
        return Double.parseDouble(df.format((total)));
    }
}
