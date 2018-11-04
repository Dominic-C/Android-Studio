package solution_2017;
import java.util.Comparator;
import solution_2017.*;

/**
 * Created by ngaiman_cheung on 28/9/17.
 */

public class LineSlopeComparator implements Comparator<Line> {
    @Override
    public int compare(Line m, Line n){
        double mSlope = m.computeSlope();
        double nSlope = n.computeSlope();

        if (mSlope > nSlope)
            return 1;
        else if (mSlope < nSlope)
            return -1;
        else
            return 0;
    }


}
