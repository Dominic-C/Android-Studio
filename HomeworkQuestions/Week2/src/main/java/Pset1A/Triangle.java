package Pset1A;

public class Triangle {
    double side1, side2, side3;


    public Triangle(double a, double b, double c)
    {
        this.side1 = a;
        this.side2 = b;
        this.side3 = c;
    }

    public Triangle(){
        this(1.0, 1.0, 1.0);
    }

    public double getArea()
    {
        double p = (this.side1 + this.side2 + this.side3)/2.0;
        return Math.sqrt(p*(p-this.side1)*(p-this.side2)*(p-this.side3));
    }

    public double getPerimeter()
    {
        return this.side1 + this.side2 + this.side3;
    }

    public String toString()
    {
        String output = "Triangle: side1 = " + this.side1 + " side2 = " + this.side2 + " side3 = " + this.side3;
        return output;
    }

    public static void main(String [] args)
    {
        Triangle  myTri  =  new  Triangle();

//        myTri.setColor("red");

//        myTri.setFilled(true);

        System.out.println(myTri);

//        System.out.println(myTri.isFilled());

        Triangle  myTri2  =  new  Triangle(2.0,  4.0,  5.5);

        System.out.println(myTri2);

        System.out.println("area :  "  + myTri2.getArea() +  "  perimeter:  "  +

                myTri2.getPerimeter());
    }

}
