package Robot2;


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
        rightNode.add(robot_c);
        rightNode.add(robot_r+1);

        // Move right
        if(robot_c < c && grid[robot_r][robot_c+1] != 1 && !visited.contains(rightNode) && robot_c+1 < c)
        {
            path.add(new Point (robot_r, robot_c));
            move(robot_c);
        }

        // Move down
        else if(robot_r < r && grid[robot_r+1][robot_c] != 1 && !visited.contains(bottomNode) && robot_r+1 < r)
        {
            path.add(new Point (robot_r, robot_c));
            move(robot_r);
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
    private static void move(int direction)
    {
        direction++;
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

