import java.util.Scanner;

public class Factorial {
    private static long factorial(int n){
        if(n==0) return 1;
        else return n * factorial(--n);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter a number: ");
        n = input.nextInt();
        System.out.println(n + "! = " + factorial(n));
    }
}
