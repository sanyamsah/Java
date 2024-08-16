import java.util.Scanner;

public class SquareRoot {
    private static double sqrt(long n, int p){ // returns the nearest value
        long first = 1, last = n;
        long mid = 1;
        double root = 0.0;
        while(first < last){
            mid = (first + last) / 2;
            if(mid * mid == n) return mid;
            else if(mid * mid > n) last = mid - 1;
            else first = mid + 1;
        }
        double incr = 0.1;
        System.out.println(root);
        for(int i = 0; i < p; i++){
            while(root * root <= n){
                root += incr;
            }
            root -= incr;
            incr /= 10;
        }
        return root;
    }
    // Newton-Raphson method: O(log(n)f(n)),
    // f(n) = cost of calculating f(x)/f'(x) with n-digit precision
    private static double sqrt(double n){
        double x = n;
        double root;
        while(true){
            root = 0.5 * (x + n / x);
            double error = Math.abs(root - x);
            if(error < 0.5){
                break;
            }
            x = root;
        }
        return root;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        long num = input.nextLong();
        int precision = 3;
        System.out.println("Square root: ");
        System.out.printf("%.3f\n", sqrt(num, precision));
        System.out.println("Square root: " + sqrt(num));
    }
}
