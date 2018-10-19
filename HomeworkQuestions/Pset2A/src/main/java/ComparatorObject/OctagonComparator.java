package ComparatorObject;

import java.util.Comparator;

public class OctagonComparator implements Comparator<Octagon> {
    public int compare(Octagon o1, Octagon o2)
    {
        return (int)(o1.getSide() - o2.getSide());
    }
}
