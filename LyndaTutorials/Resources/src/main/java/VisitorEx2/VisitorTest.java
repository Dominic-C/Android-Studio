package VisitorEx2;

import java.util.ArrayList;

public class VisitorTest {
    public static void main(String[] args) {

        // Create visitor objects
        TaxVisitor taxCalc = new TaxVisitor();
        TaxHolidayVisitor taxHolidayCalc = new TaxHolidayVisitor();

        Necessity milk = new Necessity(3.47);
        Liquor vodka = new Liquor(11.99);
        Tobacco cigars = new Tobacco(19.99);

        ArrayList<Visitable> checkTax = new ArrayList<>();
        checkTax.add(milk);
        checkTax.add(vodka);
        checkTax.add(cigars);

        for(Visitable v : checkTax)
        {
           v.accept(taxCalc);
        }

//        System.out.println(taxCalc.visit(Visitable v));
        System.out.println(taxCalc.visit(vodka));

    }
}
