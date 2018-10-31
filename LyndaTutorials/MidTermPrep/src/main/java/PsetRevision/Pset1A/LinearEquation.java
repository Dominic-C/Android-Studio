package PsetRevision.Pset1A;

public class LinearEquation {
    private double a,b,c,d,e,f;
    private double determinant = 0; // there is no purpose of assigning 0, because it was never used before assigning a different value.

    LinearEquation(double aa, double bb, double cc, double dd, double ee, double ff)
    {
        this.a = aa;
        this.b = bb;
        this.c = cc;
        this.d = dd;
        this.e = ee;
        this.f = ff;

        this.determinant = (a*d - b*c);
    }

    private double getA() {
        return a;
    }

    private double getB() {
        return b;
    }

    private double getC() {
        return c;
    }

    private double getD() {
        return d;
    }

    private double getE() {
        return e;
    }

    private double getF() {
        return f;
    }

    private double getDeterminant() {
        return determinant;
    }

    public boolean isSolvable()
    {
        /**
        * ax+by=e
        * cx+dy=f
         *
         * x = de-bf / det
         * y = af-ce / det
         * where det = a*d - b*c
         * */
//        if(a*d - b*c == 0)
//            return false;
//        return true; can be simplified to
        return(!(this.getA()*this.getD() - this.getB()*this.getC() == 0));
    }

    public double getX()
    {
        return (this.getD()*this.getE() - this.getB()*this.getF())/this.getDeterminant();
    }
    public double getY()
    {
        return (this.getA()*this.getF()-this.getC()*this.getE())/this.getDeterminant();
    }
}
