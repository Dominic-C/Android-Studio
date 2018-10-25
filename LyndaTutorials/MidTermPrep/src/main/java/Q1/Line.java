package Q1;

public class Line implements Comparable<Line>{
     //TODO: IMPLEMENT CLASS
    private double x1, y1, x2, y2;

    public Line()
    {
        this(0,0,1,1);
    }

    public Line(double x1, double y1, double x2, double y2)
    {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double computeSlope()
    {
        double slope = (this.y2 - this.y1)/(this.x2 - this.x1);
        return slope;
    }

    public double computeLength()
    {
        double length = Math.sqrt(Math.pow((this.y2 - this.y1),2) + Math.pow((this.x2 - this.x1),2));
        return length;
    }

    @Override
    public String toString()
    {
        return "Line:("+x1+","+y1+");("+x2+","+y2+")";
    }

    public int compareTo(Line l)
    {
        if (this.computeLength() > l.computeLength())
            return 1;
        else if (this.computeLength() < l.computeLength())
            return -1;
        else return 0;
    }

}
