package ComparableInterface;

public class Octagon implements Comparable<Octagon>{
    private double side;
    public Octagon(double side)
    {
        this.side = side;
    }
    public double getSide()
    {
        return side;
    }
    public int compareTo(Octagon o)
    {
        if(this.side*8 > o.side*8)
            return 1;
        else if (this.side*8 == o.side*8)
            return 0;
        else
            return -1;
    }
}
