import java.util.Scanner;

public class SumOfDigits {
    private static int sum(int n){
        if(n < 10) return n;
        int rem = n % 10;
        return sum(n / 10) + rem;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter multi-digit number: ");
        int num = input.nextInt();
        System.out.println("Sum of digits = " + sum(num));
    }
}
