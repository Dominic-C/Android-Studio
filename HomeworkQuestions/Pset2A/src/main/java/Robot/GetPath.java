package Robot;

import java.util.ArrayList;

public class GetPath {

    /**
     * Implemented a Depth First Search (DFS) algorithm to make the robot traverse down to a specified point
     * recursive call once whenever i reach a new node.
     *
     * Code below consists of if else statements that tells the robot what to do to get to a new node
     * If it cant go to a new node, it recursively goes back to the previous node to find for alternative paths
    * */
    static int robot_r = 0, robot_c = 0;
    // Nested array list to store points.
    static final ArrayList<ArrayList> visited = new ArrayList<>();
    static ArrayList<Point> tempPath = new ArrayList<>();

    public static boolean getPath (int r, int c, ArrayList<Point> path, final int [][] grid) {
        int numberOfRows = grid.length -1;
        int numberOfCols = grid[0].length -1;

        // want a static array because i want to use it in a method
        tempPath = path;

        // adding initial start point (0,0)
        if(robot_r == 0 && robot_c == 0 && visited.size() == 0)
        {
            tempPath.add(new Point(0,0));
            // add starting point
            ArrayList<Integer> startingPoint = new ArrayList<>();
            startingPoint.add(0);
            startingPoint.add(0);
            visited.add(startingPoint);
        }

        // if row or column not in the the grid, return false (cannot reach destination)
        if(r > numberOfRows|| c > numberOfCols)
            return false;

        // if robot is at destination, return true
        if(robot_c == c && robot_r == r)
        {
            cleanup();
            return true;
        }

        // points to visit
        ArrayList<Integer> pointToVisitDown = new ArrayList<>();
        pointToVisitDown.add(robot_c);
        pointToVisitDown.add(robot_r+1);

        ArrayList<Integer> pointToVisitRight = new ArrayList<>();
        pointToVisitRight.add(robot_c+1);
        pointToVisitRight.add(robot_r);

        // checking if right node is available for visiting
        if(robot_c + 1 <= numberOfCols && grid[robot_r][robot_c+1] == 0 && !visited.contains(pointToVisitRight) && pointToVisitRight.get(0) <= numberOfCols) // if block to the right is not a 1 and is inside the grid
        {
            moveRight();
            // could have added path.add(new Point) here, but put into method to make things neater
        }

        // checking if left node is available for visiting
        else if(robot_r + 1 <= numberOfRows && grid[robot_r+1][robot_c] == 0 && !visited.contains(pointToVisitDown) && pointToVisitDown.get(1) <= numberOfRows) // if block below is not a 1 and is inside the grid
        {
            moveDown();
        }

        // otherwise, backtrack by one, remove point from path
        else
        {
            // remove current point from path
            tempPath.remove(tempPath.size() - 1);

            // set robots location back to last point before failing
            Point lastPoint = tempPath.get(tempPath.size() - 1);
            robot_c = lastPoint.y;
            robot_r = lastPoint.x;
//            System.out.printf("Dead end, back tracking to (%d,%d)\n", robot_r, robot_c);
        }

        // if robot_c and robot_r not at destination
        if(robot_c == c && robot_r == r)
        {
            cleanup();
            return true;
        }
        // need to check if it has visited bottom bottom nodes, previously terminated at 0,0
        // create a point for bottom location
        ArrayList<Integer> bottomPoint = new ArrayList<>();
        bottomPoint.add(robot_c);
        bottomPoint.add(robot_r+1);

        // if robot reaches back to start position, it gave up
        // IMPORTANT: without the last check in this statement, if robot goes back to 0,0 but has not explored the node below 0,0, it returns a false negative result.
        if(robot_c == 0 && robot_r == 0 && (visited.contains(bottomPoint) || grid[1][0] == 1))
        {
            cleanup();
            return false;
        }

        return getPath(r,c,tempPath,grid);
    }

    // Move methods set robot_c and robot_r to current c and r, then adds location to visited and path arrays
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

    public static void cleanup()
    {
        robot_r = 0;
        robot_c = 0;
        visited.clear();
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

