import java.util.Arrays;

public class LongestCommonSubsequence {
    // Purely recursive solution: Exponential time complexity
    private static int lcs(String s1, String s2, int m, int n){
        if(m==0 || n==0) return 0;
        if(s1.charAt(m-1) == s2.charAt(n-1)){
            return 1 + lcs(s1,s2,m-1,n-1);
        }
        else{
            return Math.max(lcs(s1,s2,m-1,n), lcs(s1,s2,m,n-1));
        }
    }

    // Memorization-based solution
    private static int lcs(String a, String b, int m, int n, int[][] memo){
        if(memo[m][n] != -1) return memo[m][n];
        if(m == 0 || n == 0) memo[m][n] = 0;
        else{
            if(a.charAt(m-1) == b.charAt(n-1)){
                memo[m][n] = 1 + lcs(a,b,m-1,n-1,memo);
            } else{
                memo[m][n] = Math.max(
                       lcs(a,b,m-1,n,memo),
                       lcs(a,b,m,n-1,memo)
                );
            }
        }
        return memo[m][n];
    }

    // Tabulation-based solution
    private static int lcs(String s1, String s2, int[][]dp){
        int m = s1.length(), n = s2.length();
        for(int i = 1; i < dp.length; i++){
            for(int j = 1; j < dp[0].length; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }

    public static void main(String[] args) {
        String s1 = "abcdghijk";
        String s2 = "aedfhrhikj";
        int m = s1.length(), n = s2.length();

        System.out.println("Length of LCS: " + lcs(s1,s2,m,n));

        int[][] dp = new int[m + 1][n + 1];
        System.out.println("Length of LCS: " + lcs(s1,s2,dp));

        int[][] memo = new int[m + 1][n + 1];
        for(int i = 0; i <= m; i++){
            Arrays.fill(memo[i],-1);
        }
        System.out.println("Length of LCS: " + lcs(s1,s2,m,n,memo));
    }
}
