import java.util.Scanner;

public class FibonacciDP {
    private static long fibo(int n, long[] memo){
        if(n<=1) return n;
        if(memo[n] != -1) return memo[n];
        memo[n] = fibo(n-1, memo) + fibo(n-2, memo);
        return memo[n];
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter the number of terms: ");
        n = input.nextInt();
        long[] memo = new long[n+1];
        for(int i=0; i<=n; i++){
            memo[i] = -1;
        }
        System.out.println("First " + n + " Fibonacci numbers: ");
        for (int i = 0; i <= n; i++) {
            System.out.print(fibo(i, memo) + " ");
            if((i+1)%10==0) System.out.println();
        }
    }
}
