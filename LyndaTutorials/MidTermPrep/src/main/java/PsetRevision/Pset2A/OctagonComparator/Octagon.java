package PsetRevision.Pset2A.OctagonComparator;

import java.util.Comparator;

public class Octagon{
        private double side;
        public Octagon(double side)
        {
            this.side = side;
        }
        public double getSide()
        {
            return side;
        }
    }

    class OctagonComparator implements Comparator<Octagon>
    {
        @Override
        public int compare(Octagon octagon, Octagon t1) {
            if(octagon.getSide() > t1.getSide())
                return 1;
            else if (octagon.getSide() == t1.getSide())
                return 0;
            else
                return -1;
        }
    }
