import java.util.Scanner;

public class Fibonacci {
    private static int fibo(int n) { // exponential time complexity O(2^n)
        if(n <= 1) return n;
        else{
            return fibo(n-1) + fibo(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter the number of terms: ");
        n = input.nextInt();
        System.out.println("First " + n + " Fibonacci numbers: ");
        for (int i = 0; i <= n; i++) {
            System.out.print(fibo(i) + " ");
        }
    }
}
