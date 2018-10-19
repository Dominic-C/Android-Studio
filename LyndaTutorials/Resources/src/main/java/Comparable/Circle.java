package Comparable;

public class Circle extends GeometricObject implements Comparable<Circle> { // In comparable, we define the compareTo method inside the class.

    private double radius = 1;
    Circle(){};

    Circle(double radius)
    {
        setRadius(radius);
    }

    private void setRadius(double newRadius)
    {
        this.radius = newRadius;
    }

    public int compareTo(Circle c)
    {
        if(this.radius > c.radius)
            return 1;
        else if (this.radius == c.radius)
            return 0;
        else
            return -1;
    }

    @Override
    public String toString()
    {
        return "radius: " + this.radius;
    }
}
