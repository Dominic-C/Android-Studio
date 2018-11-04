package Q1;

public class Circle {
    private double x, y; //center of circle
    private double radius;

    Circle()
    {
        this(0,0,1);
    }

    Circle(double xinput, double yinput, double Radius)
    {
        this.x = xinput;
        this.y = yinput;
        this.radius = Radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius()
    {
        return this.radius;
    }

    public double getArea()
    {
        return Math.PI*getRadius()*getRadius();
    }

    public double getPerimeter()
    {
        return 2.0*Math.PI*getRadius();
    }

    public boolean contains(double px, double py)
    {
        double deltaX = px - this.getX();
        double deltaY = py - this.getY();
        if(Math.sqrt(deltaX*deltaX + deltaY*deltaY) <= this.getRadius())
            return true;
        return false;
    }

    public boolean contains(Circle c)
    {
        double deltaX = c.getX() - getX();
        double deltaY = c.getX() - getY();
        double innerRadius = c.getRadius();
        if(Math.sqrt(deltaX*deltaX + deltaY*deltaY) + innerRadius <= this.getRadius())
            return true;
        else
        {
            return false;
        }

    }

    public boolean overlaps(Circle c)
    {
        double deltaX = c.getX() - getX();
        double deltaY = c.getX() - getY();
        double innerRadius = c.getRadius();
        if(Math.sqrt(deltaX*deltaX + deltaY*deltaY) - innerRadius <= this.getRadius())
            return true;
        return false;
    }

}
