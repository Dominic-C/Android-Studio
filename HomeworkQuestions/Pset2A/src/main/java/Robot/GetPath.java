package Robot;

import java.util.ArrayList;
public class GetPath {
    private static int robot_r =0, robot_c =0;
    private static ArrayList<ArrayList<Integer>> visited = new ArrayList<>();
    public static boolean getPath (int r, int c, ArrayList<Point> path, final int [][] grid) {
        // initial point
        if(visited.size() == 0 && robot_c == 0 && robot_r == 0)
        {
            path.add(new Point(robot_r, robot_c));
            visited.add(addVisited());
        }

        // base case
        if(robot_c == c && robot_r == r)
        {
            path.add(new Point(r,c));
            visited.add(addVisited());
            reset();
            return true;
        }
        if(grid[r][c] == 1) // cannot visit
        {
            return false;
        }
        // add case where
        // node on right
        ArrayList<Integer> rightNode = new ArrayList<>();
        rightNode.add(robot_c+1);
        rightNode.add(robot_r);

        // node at bottom
        ArrayList<Integer> bottomNode = new ArrayList<>();
        bottomNode.add(robot_c);
        bottomNode.add(robot_r+1);

        // Move right
        if(robot_c < c && grid[robot_r][robot_c+1] != 1 && !visited.contains(rightNode) && robot_c+1 <= c)
        {
            path.add(new Point (robot_r, robot_c));
            moveRight();
            //System.out.printf("Move right to (%d, %d)\n",robot_r, robot_c);
        }

        // Move down
        else if(robot_r < r && grid[robot_r+1][robot_c] != 1 && !visited.contains(bottomNode) && robot_r+1 <= r)
        {
            path.add(new Point (robot_r, robot_c));
            moveDown();
            //System.out.printf("Move down to (%d, %d)\n",robot_r, robot_c);
        }

        // backtrack
        else
        {
            if(path.size() != 0) // can only backtrack if we moved
            {
                path.remove(path.size() -1);
                Point previousPoint = path.get(path.size() -1);
                robot_c = previousPoint.y;
                robot_r = previousPoint.x;
            }
        }

        if(robot_r == 0 && robot_c == 0) // if return to start, fail
        {
            return false;
        }

        return getPath(r,c,path,grid);
    }
    private static void moveRight()
    {
        robot_c++;
        visited.add(addVisited());
    }
    private static void moveDown()
    {
        robot_r++;
        visited.add(addVisited());
    }

    private static void reset()
    {
        robot_r = 0;
        robot_c = 0;
        visited.clear();
    }
    private static ArrayList<Integer> addVisited()
    {
        ArrayList<Integer> visit = new ArrayList<>();
        visit.add(robot_c);
        visit.add(robot_r);
        return visit;
    }
}

//public class GetPath {
//    static int robot_r = 0, robot_c = 0;
//    static final ArrayList<ArrayList> visited = new ArrayList<>();
//    static ArrayList<Point> tempPath = new ArrayList<>();
//
//    public static boolean getPath (int r, int c, ArrayList<Point> path, final int [][] grid) {
//        int numberOfRows = grid.length -1;
//        int numberOfCols = grid[0].length -1;
//        tempPath = path;
//        if(robot_r == 0 && robot_c == 0 && visited.size() == 0)
//        {
//            tempPath.add(new Point(0,0));
//            ArrayList<Integer> startingPoint = new ArrayList<>();
//            startingPoint.add(0);
//            startingPoint.add(0);
//            visited.add(startingPoint);
//        }
//
//        // if row or column not in the the grid, return false (cannot reach destination)
//        if(r > numberOfRows|| c > numberOfCols)
//            return false;
//
//        if(robot_c == c && robot_r == r) // if robot is at destination, return false
//        {
//            robot_r = 0;
//            robot_c = 0;
//            visited.clear();
//            return true;
//        }
//
//        // points to visit
//        ArrayList<Integer> pointToVisitDown = new ArrayList<>();
//        pointToVisitDown.add(robot_c);
//        pointToVisitDown.add(robot_r+1);
//
//        ArrayList<Integer> pointToVisitRight = new ArrayList<>();
//        pointToVisitRight.add(robot_c+1);
//        pointToVisitRight.add(robot_r);
//
//        if(robot_c + 1 <= numberOfCols && grid[robot_r][robot_c+1] == 0 && !visited.contains(pointToVisitRight) && pointToVisitRight.get(0) <= numberOfCols) // if block to the right is not a 1 and is inside the grid
//        {
//            moveRight();
//        }
//
//        else if(robot_r + 1 <= numberOfRows && grid[robot_r+1][robot_c] == 0 && !visited.contains(pointToVisitDown) && pointToVisitDown.get(1) <= numberOfRows) // if block below is not a 1 and is inside the grid
//        {
//            moveDown();
//        }
//
//        else // otherwise, backtrack by one, remove point from path
//        {
//            // remove current point from path
//            tempPath.remove(tempPath.size() - 1);
//            Point lastPoint = tempPath.get(tempPath.size() - 1);
//
//            robot_c = lastPoint.y;
//            robot_r = lastPoint.x;
////            System.out.printf("Dead end, back tracking to (%d,%d)\n", robot_r, robot_c)
//        }
//
//        // if robot_c and robot_r not at destination
//        if(robot_c == c && robot_r == r)
//        {
//            robot_r = 0;
//            robot_c = 0;
//            visited.clear();
//            return true;
//        }
//
//        // if robot reaches back to start position, it gave up
//        if(robot_c == 0 && robot_r == 0)
//        {
//            robot_r = 0;
//            robot_c = 0;
//            visited.clear();
//            return false;
//        }
//
//        return getPath(r,c,tempPath,grid);
//    }
//
//    public static void moveRight()
//    {
//        robot_c++;
//        ArrayList<Integer> visitedPosition = new ArrayList<>();
//        visitedPosition.add(robot_c);
//        visitedPosition.add(robot_r);
//        visited.add(visitedPosition);
//        tempPath.add(new Point(robot_r, robot_c));
////        System.out.printf("moved right to: (%d,%d)\n",robot_r, robot_c);
//    }
//
//    public static void moveDown()
//    {
//        robot_r++;
//        ArrayList<Integer> visitedPosition = new ArrayList<>();
//        visitedPosition.add(robot_c);
//        visitedPosition.add(robot_r);
//        visited.add(visitedPosition);
//        tempPath.add(new Point(robot_r, robot_c));
////        System.out.printf("moved down to: (%d,%d)\n",robot_r, robot_c);
//    }
//
//}

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

