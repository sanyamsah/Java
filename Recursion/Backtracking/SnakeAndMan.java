import java.util.Arrays;
import java.util.Scanner;

public class SnakeAndMan {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int m = input.nextInt();
//        int n = input.nextInt();
//        char[][] maze = new char[m][n];
        char[][] maze = {
                {'p', 'p', 'p', 'p', 'p', 'p'},
                {'p', 'm', 'p', 'p', 'w', 'p'},
                {'p', 'p', 'p', 'p', 'p', 'p'},
                {'p', 'w', 'p', 'w', 'p', 'p'},
                {'p', 's', 'p', 'p', 'p', 'p'},
                {'p', 'p', 'w', 'p', 'p', 'p'}
        };
        int idx = 0, jdx = 0;
        for(int i = 0; i < maze.length; i++){
            for(int j = 0; j < maze[0].length; j++){
                if(maze[i][j] == 's'){
                    idx = i; jdx = j;
                }
            }
        }
        for(char[] arr : maze){
            System.out.println(Arrays.toString(arr));
        }
        System.out.println(idx);
        System.out.println(jdx);
        System.out.println("Number of ways: " + findPaths(maze, idx, jdx));
    }
    private static int findPaths(char[][] maze, int i, int j){
        if(maze[i][j] == 't' || maze[i][j] == 'w') return 0;
        if(maze[i][j] == 'm') {
            return 1;
        }
        int count = 0;
        maze[i][j] = 't';
        if(isValid(maze, i, j-1)){
            count += findPaths(maze, i, j-1);
        }
        if(isValid(maze, i - 1, j)){
            count += findPaths(maze, i - 1, j);
        }
        if(isValid(maze, i, j+1)){
            count += findPaths(maze, i, j+1);
        }
        if(isValid(maze, i+1, j)){
            count += findPaths(maze, i+1, j);
        }
        maze[i][j] = 'p';
        return count;
    }
    private static boolean isValid(char[][] maze, int row, int col){
        return (row >= 0 && row < maze.length && col >= 0 && col < maze[0].length);
    }
}
