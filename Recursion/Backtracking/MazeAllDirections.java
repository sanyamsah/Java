import java.util.ArrayList;

public class MazeAllDirections {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
//        boolean[][] maze = {
//                {true, true, true, true},
//                {true, false, true, true},
//                {true, false, true, true},
//                {true, true, true, true}
//        };
        System.out.println("Paths: " + pathList(maze, 0, 0, ""));
    }
    private static ArrayList<String> pathList(boolean[][] maze, int r, int c, String path){
        ArrayList<String> paths = new ArrayList<>();
        if(r == maze.length - 1 && c == maze[0].length - 1){
            paths.add(path);
            return paths;
        }
        if(!maze[r][c]){
            return paths;
        }
        maze[r][c] = false;
        ArrayList<String> down = new ArrayList<>();
        ArrayList<String> right = new ArrayList<>();
        ArrayList<String> up = new ArrayList<>();
        ArrayList<String> left = new ArrayList<>();
        if(r < maze.length - 1){
            paths.addAll(pathList(maze, r + 1, c, path + "D"));
        }
        if(c < maze[0].length - 1){
            paths.addAll(pathList(maze, r, c + 1, path + "R"));
        }
        if(r > 0){
            paths.addAll(pathList(maze, r - 1, c, path + "U"));
        }
        if(c > 0){
            paths.addAll(pathList(maze, r, c - 1, path + "L"));
        }
        maze[r][c] = true;
        return paths;
    }
//    private static ArrayList<String> pathList(boolean[][] maze, int r, int c, String path){
//        if(r == maze.length - 1 && c == maze[0].length - 1){
//            ArrayList<String> list = new ArrayList<>();
//            list.add(path);
//            return list;
//        }
//        ArrayList<String> down = new ArrayList<>();
//        ArrayList<String> right = new ArrayList<>();
//        ArrayList<String> up = new ArrayList<>();
//        ArrayList<String> left = new ArrayList<>();
//        if(r < maze.length - 1 && maze[r][c]){
//            maze[r][c] = false;
//            down = pathList(maze, r + 1, c, path + "D");
//            maze[r][c] = true;
//        }
//        if(c < maze[0].length - 1 && maze[r][c]){
//            maze[r][c] = false;
//            right = pathList(maze, r, c + 1, path + "R");
//            maze[r][c] = true;
//        }
//        if(r > 0 && maze[r][c]){
//            maze[r][c] = false;
//            up = pathList(maze, r - 1, c, path + "U");
//            maze[r][c] = true;
//        }
//        if(c > 0 && maze[r][c]){
//            maze[r][c] = false;
//            left = pathList(maze, r, c - 1, path + "L");
//            maze[r][c] = true;
//        }
//        down.addAll(right);
//        down.addAll(up);
//        down.addAll(left);
//        return down;
//    }
}