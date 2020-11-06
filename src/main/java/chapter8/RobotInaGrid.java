package chapter8;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class RobotInaGrid {

    public static void main(String[] args) {

        boolean [][] grid = new boolean[3][3];
        
        getPath(grid);
    }

    public  static ArrayList<Point> getPath(boolean [][] grid){

        int lastRow = grid.length-1;

        int lastCol = grid[0].length-1;

        ArrayList<Point> path = new ArrayList<>();
        HashMap<Point, Boolean> cache = new HashMap<>();

        if (getPath(grid, lastRow, lastCol, path, cache))
             return path;

        return  path;
    }

    private static boolean getPath(boolean[][] grid,
                                            int row,
                                            int col,
                                            ArrayList<Point> path,
                                            HashMap<Point, Boolean> cache) {


        if(row < 0 || col < 0 || !grid[row][col] ){
            return false;
        }



        Point p = new Point(row, col);

        if(cache.containsKey(p))
            return  cache.get(p);

        boolean isAtOrigin = (row == 0) && (col == 0);

        boolean success = false;

        if(isAtOrigin || getPath(grid, row -1 , col, path, cache) || getPath(grid, row, col-1, path, cache)){


            path.add(p);
            success = true;
        }

        cache.put(p, success);

        return  success;
    }


}

class Point{
    int row;
    int col;
    public Point(int row, int col){
        this.row = row;
        this.col = col;
    }

    @Override
    public String toString(){
        return row + " , " + col;
    }
}
