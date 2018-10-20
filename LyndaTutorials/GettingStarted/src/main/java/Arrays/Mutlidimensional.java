package Arrays;

import java.util.ArrayList;

import Super.A;

public class Mutlidimensional {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> answer = new ArrayList<>();

        int [][] grid = {
                {2,1,3,5},
                {4,2,6,6},
                {2,2,6,2}
        };

//        answer.add(new Point(1,2));
//        answer.add(new Point(4,2));
//        answer.add(new Point(1,7));

//        Point pt = new Point(1,7);
//        System.out.println(answer.contains(new Point(1,7)));

        ArrayList<Integer> w = new ArrayList<>();
        w.add(1);
        w.add(5);
        answer.add(w);

        System.out.println(answer.contains(w));

    }


}

class Point {
    int x;
    int y;

    Point (int x, int y) {
        this.x=x;
        this.y=y;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
