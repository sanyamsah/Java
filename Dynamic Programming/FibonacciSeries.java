import java.util.Arrays;
import java.util.Scanner;

public class FibonacciSeries {
    private static int fibo(int[] memo, int n){
        if(memo[n] == -1){
            if(n==0 || n==1) memo[n] = n;
            else memo[n] = fibo(memo, n-1) + fibo(memo,n-2);
        }
        return memo[n];
    }
    public static void main(String[] args) {
        System.out.print("Enter n: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] memo = new int[n + 1];
        Arrays.fill(memo, -1);
        System.out.println((fibo(memo, n)));
        System.out.println(Arrays.toString(memo));
    }
}
