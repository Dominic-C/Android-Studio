package Week4.Octagon;

public class Octagon extends GeometricObject implements Comparable<Octagon>{

    private int lengthOfSide = 1;

    public Octagon(){}

    public Octagon(int l){
        setLengthOfSide(l);
    }

    public void setLengthOfSide(int lengthOfSide) {
        this.lengthOfSide = lengthOfSide;
    }

    public int compareTo(Octagon o)
    {
        return this.lengthOfSide - o.lengthOfSide;
    }

    public String toString()
    {
        return "Length = " + this.lengthOfSide;
    }
}
