import java.util.ArrayList;

public class MazeWithObstacles {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true, true},
                {true, false, false, true},
                {true, true, true, true},
                {true, false, true, true}
        };
        System.out.println("Paths: " + pathList(maze, 0, 0, ""));
    }
    private static ArrayList<String> pathList(boolean[][] maze, int row, int col, String path){
        if(row == maze.length - 1 && col == maze[0].length - 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(path);
            return list;
        }
        if(!maze[row][col]){
            return new ArrayList<>();
        }
        ArrayList<String> down = new ArrayList<>();
        if(row < maze.length - 1){
            down = pathList(maze, row + 1, col, path + "D");
        }
        ArrayList<String> right = new ArrayList<>();
        if(col < maze[0].length - 1){
            right = pathList(maze, row, col + 1, path + "R");
        }
        down.addAll(right);
        return down;
    }
}
