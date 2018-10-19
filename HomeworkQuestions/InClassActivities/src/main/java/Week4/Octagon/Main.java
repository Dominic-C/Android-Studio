package Week4.Octagon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList<Octagon> o = new ArrayList<>();
        o.add(new Octagon(2));
        o.add(new Octagon(6));
        o.add(new Octagon(3));

        Comparable<Octagon> y = new Octagon(2);

        Collections.sort(o);

        System.out.println(o);

    }
}
