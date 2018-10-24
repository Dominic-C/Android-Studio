package Robot2;

import java.util.ArrayList;

import Robot2.GetPath;
import Robot2.Point;

public class TestRobot {
    public static void main(String[] args) {
        final int [][] grid0 =
                {
                        {0,1,0,0},
                        {0,0,1,0},
                        {1,0,0,1},
                        {1,1,0,0}
                };
//
        ArrayList<Point> path = new ArrayList<>();
//
        boolean success = GetPath.getPath(3,2, path, grid0);

        System.out.println(success);
        if(success)
            System.out.println(path);
        path.clear();

//        System.out.println("path purge: " + path.size());
        final int [][] grid =
                {
                        {0,1,0,0},
                        {0,0,1,0},
                        {1,0,0,1},
                        {1,1,0,0}
                };

        success = GetPath.getPath(3,2, path, grid);

        System.out.println(success);
        if(success)
            System.out.println(path);
        path.clear();


    }
}
