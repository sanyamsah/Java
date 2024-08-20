import java.util.Scanner;

// Number of ways to go to last cell of rows x cols matrix
public class Maze {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int rows = input.nextInt();
        System.out.print("Enter columns: ");
        int cols = input.nextInt();
        System.out.println("No. of ways: " + maze(rows, cols));
    }
//    private static int maze(int r, int c){
//        if(r == 1 || c == 1) return 1;
//        int left = maze(r-1, c);
//        int right = maze(r, c-1);
//        return left + right;
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
}
