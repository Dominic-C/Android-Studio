package Robot;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class GetPath {
    static int robot_r = 0, robot_c = 0;
    static final ArrayList<ArrayList> visited = new ArrayList<>();
    static ArrayList<Point> tempPath = new ArrayList<>();

    public static boolean getPath (int r, int c, ArrayList<Point> path, final int [][] grid) {
        int numberOfRows = grid.length -1;
        int numberOfCols = grid[0].length -1;
        tempPath = path;

        // if row or column not in the the grid, return false (cannot reach destination)
        if(r > numberOfRows|| c > numberOfCols)
            return false;

        if(robot_c == c && robot_r == r) // if robot is at destination, return false
            return true;

        // points to visit
        ArrayList<Integer> pointToVisitDown = new ArrayList<>();
        pointToVisitDown.add(robot_c);
        pointToVisitDown.add(robot_r+1);

        ArrayList<Integer> pointToVisitRight = new ArrayList<>();
        pointToVisitRight.add(robot_c+1);
        pointToVisitRight.add(robot_r);


        // condition to move down
////        System.out.printf("grid[robot_r+1][robot_c] = grid[%d][%d]\n", robot_r+1, robot_c);
//        System.out.printf("\nrobot_r = %d, robot_c = %d\n", robot_r, robot_c);
//        System.out.println("robot_c + 1 <= numberOfCols = " + (robot_c + 1 <= numberOfCols));
//        System.out.println("pointToVisitRight.x <= numberOfCols = " + (pointToVisitRight.x <= numberOfCols));
//        System.out.println("grid[robot_r][robot_c+1] != 1 = " + (grid[robot_r][robot_c+1] != 1));
//        System.out.println("!visited.contains(pointToVisitRight) = "+ !visited.contains(pointToVisitRight) + "\n");

        if(robot_r + 1 <= numberOfRows && grid[robot_r+1][robot_c] != 1 && !visited.contains(pointToVisitDown) && pointToVisitDown.get(1) <= numberOfRows) // if block below is not a 1 and is inside the grid
        {
                // move robot down by one block
                moveDown();
        }

        else if(robot_c + 1 <= numberOfCols && grid[robot_r][robot_c+1] != 1 && !visited.contains(pointToVisitRight) && pointToVisitRight.get(0) <= numberOfCols) // if block to the right is not a 1 and is inside the grid
        {

                // move robot right by one block
                moveRight();
        }

        else // otherwise, backtrack by one, remove point from path
        {
            // remove current point from path
            tempPath.remove(tempPath.size() - 1);
//            System.out.println(tempPath);
//
//            System.out.println(visited);
            // get last point
            Point lastPoint = tempPath.get(tempPath.size() - 1);
            robot_c = lastPoint.x;
            robot_r = lastPoint.y;
//            System.out.println("lastPoint.x = " + lastPoint.x);
//            System.out.println("lastPoint.y = " + lastPoint.y);
            System.out.printf("Dead end, back tracking to (%d,%d)", robot_c, robot_r);

            // if last point was the starting point, it means that it failed to find a solution
            if(lastPoint.x == 0 && lastPoint.y == 0)
                return false;
        }

        // if robot_c and robot_r not at destination, call getPath(r,c,path,grid)
        if(robot_c == c && robot_r == r)
        {
            return true;
        }


        return getPath(r,c,tempPath,grid);
    }

    public static void moveRight()
    {
        robot_c++;
        ArrayList<Integer> visitedPosition = new ArrayList<>();
        visitedPosition.add(robot_c);
        visitedPosition.add(robot_r);
        visited.add(visitedPosition);
        tempPath.add(new Point(robot_c, robot_r));
        System.out.printf("moved right to: (%d,%d)\n",robot_r, robot_c);
    }

    public static void moveDown()
    {
        robot_r++;
        ArrayList<Integer> visitedPosition = new ArrayList<>();
        visitedPosition.add(robot_c);
        visitedPosition.add(robot_r);
        visited.add(visitedPosition);
        tempPath.add(new Point(robot_c, robot_r));
        System.out.printf("moved down to: (%d,%d)\n",robot_r, robot_c);
    }

//    public boolean isOccupiedRight()
//    {
//        if(robot_c + 1 <= numberOfCols && grid[robot_r][robot_c+1])
//    }
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

