package Q1;

import java.util.Comparator;

public class LineSlopeComparator implements Comparator<Line>{
     //TODO: IMPLEMENT CLASS

    public int compare(Line a, Line b)
    {
        // if a > b, return a positive int
        // if a < b, return negative int, else return 0
        if (a.computeSlope() > b.computeSlope())
            return 1;
        else if (a.computeSlope() < b.computeSlope())
            return -1;
        else return 0;
    }
}
