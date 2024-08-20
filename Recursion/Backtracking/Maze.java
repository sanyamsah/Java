import java.util.ArrayList;
import java.util.Scanner;

// Number of ways to go to last cell of rows x cols matrix
public class Maze {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int rows = input.nextInt();
        System.out.print("Enter columns: ");
        int cols = input.nextInt();
        String path = "";
        System.out.println("No. of ways: " + maze(rows, cols));
//        path(rows, cols, "");
        System.out.println(pathList(rows, cols, ""));
        System.out.println(pathListDia(rows, cols, ""));
    }
//    private static int maze(int r, int c){
//        if(r == 1 || c == 1) {
//            return 1;
//        }
//        int down = maze(r-1, c);
//        int right = maze(r, c-1);
//        return down + right;
//    }
    private static int maze(int r, int c){
        int[][] dp = new int[r][c];
        for(int i = 0; i < r; i++){
            dp[i][0] = 1;
        }
        for(int i = 0; i < c; i++){
            dp[0][i] = 1;
        }
        for(int i = 1; i < r; i++){
            for(int j = 1; j < c; j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[r-1][c-1];
    }
    private static void path(int r, int c, String path){
        if(r == 1 && c == 1){
            System.out.println(path);
        }
        if(r > 1){
            path(r-1, c, path + "D");
        }
        if(c > 1){
            path(r, c-1, path + "R");
        }
    }
    private static ArrayList<String> pathList(int r, int c, String path){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(path);
            return list;
        }
        ArrayList<String> down = new ArrayList<>();
        if(r > 1){
            down = pathList(r-1, c, path + "D");
        }
        ArrayList<String> right = new ArrayList<>();
        if(c > 1){
            right = pathList(r, c-1, path + "R");
        }
        down.addAll(right);
        return down;
    }
    private static ArrayList<String> pathListDia(int r, int c, String path){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(path);
            return list;
        }
        ArrayList<String> down = new ArrayList<>();
        if(r > 1){
            down = pathListDia(r-1, c, path + "D");
        }
        ArrayList<String> right = new ArrayList<>();
        if(c > 1){
            right = pathListDia(r, c-1, path + "R");
        }
        ArrayList<String> dia = new ArrayList<>();
        if(r > 1 && c > 1){
            dia = pathListDia(r-1, c-1, path + "[dia]");
        }
        down.addAll(right);
        down.addAll(dia);
        return down;
    }
}
