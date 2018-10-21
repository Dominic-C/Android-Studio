package Robot;

import java.util.ArrayList;


public class GetPath {
    static int robot_r = 0, robot_c = 0;
    static final ArrayList<ArrayList> visited = new ArrayList<>();
    static ArrayList<Point> tempPath = new ArrayList<>();

    public static boolean getPath (int r, int c, ArrayList<Point> path, final int [][] grid) {
        int numberOfRows = grid.length -1;
        int numberOfCols = grid[0].length -1;
        tempPath = path;
        if(robot_r == 0 && robot_c == 0 && visited.size() == 0)
        {
            tempPath.add(new Point(0,0));
            ArrayList<Integer> startingPoint = new ArrayList<>();
            startingPoint.add(0);
            startingPoint.add(0);
            visited.add(startingPoint);
        }

        // if row or column not in the the grid, return false (cannot reach destination)
        if(r > numberOfRows|| c > numberOfCols)
            return false;

        if(robot_c == c && robot_r == r) // if robot is at destination, return false
        {
            robot_r = 0;
            robot_c = 0;
            visited.clear();
            return true;
        }

        // points to visit
        ArrayList<Integer> pointToVisitDown = new ArrayList<>();
        pointToVisitDown.add(robot_c);
        pointToVisitDown.add(robot_r+1);

        ArrayList<Integer> pointToVisitRight = new ArrayList<>();
        pointToVisitRight.add(robot_c+1);
        pointToVisitRight.add(robot_r);

        if(robot_c + 1 <= numberOfCols && grid[robot_r][robot_c+1] == 0 && !visited.contains(pointToVisitRight) && pointToVisitRight.get(0) <= numberOfCols) // if block to the right is not a 1 and is inside the grid
        {
            moveRight();
        }

        else if(robot_r + 1 <= numberOfRows && grid[robot_r+1][robot_c] == 0 && !visited.contains(pointToVisitDown) && pointToVisitDown.get(1) <= numberOfRows) // if block below is not a 1 and is inside the grid
        {
            moveDown();
        }

        else // otherwise, backtrack by one, remove point from path
        {
            // remove current point from path
            tempPath.remove(tempPath.size() - 1);
            Point lastPoint = tempPath.get(tempPath.size() - 1);

            robot_c = lastPoint.y;
            robot_r = lastPoint.x;
//            System.out.printf("Dead end, back tracking to (%d,%d)\n", robot_r, robot_c)
        }

        // if robot_c and robot_r not at destination
        if(robot_c == c && robot_r == r)
        {
            robot_r = 0;
            robot_c = 0;
            visited.clear();
            return true;
        }

        // if robot reaches back to start position, it gave up
        if(robot_c == 0 && robot_r == 0)
        {
            robot_r = 0;
            robot_c = 0;
            visited.clear();
            return false;
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
        tempPath.add(new Point(robot_r, robot_c));
//        System.out.printf("moved right to: (%d,%d)\n",robot_r, robot_c);
    }

    public static void moveDown()
    {
        robot_r++;
        ArrayList<Integer> visitedPosition = new ArrayList<>();
        visitedPosition.add(robot_c);
        visitedPosition.add(robot_r);
        visited.add(visitedPosition);
        tempPath.add(new Point(robot_r, robot_c));
//        System.out.printf("moved down to: (%d,%d)\n",robot_r, robot_c);
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

