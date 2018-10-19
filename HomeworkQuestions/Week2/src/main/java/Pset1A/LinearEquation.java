package Pset1A;

public class LinearEquation {
    private double a,b,c,d,e,f;

    LinearEquation(double a, double b, double c, double d, double e, double f)
    {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }

    public boolean isSolvable()
    {
        if(this.a*this.d - this.b*this.c != 0)
            return true;
        return false;
    }

    public double getX()
    {
        double [] eq1 = {this.a, this.b, this.e};
        double [] eq2 = {this.c, this.d, this.f};

        // to find X, Y must be the same on both equations
        double divisionFactor = this.b/this.d;

        for(int i = 0; i < 3; i++)
        {
            eq1[i]/=divisionFactor; // making first equation's Y the same
        }

        double [] result = new double[3];

        for(int i = 0; i < 3; i++)
        {
            result[i] = eq1[i] - eq2[i];
        }

        return result[2]/result[0];
    }

    public double getY()
    {
        // y = (e - ax) /b
        // Calculation simplified to 1 eqn, 1 unknown using X
        double x = getX();
        double y = (this.e - this.a*x)/this.b;

        return y;
    }
}
