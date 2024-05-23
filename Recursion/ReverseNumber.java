import java.util.Scanner;

public class ReverseNumber {
    private static int reverse(int n, int rev){
        if (n == 0) return rev;
        int rem = n % 10;
        rev = rev * 10 + rem;
        return reverse(n / 10, rev);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a multi-digit number: ");
        int num = input.nextInt();
        System.out.println("Reverse: " + reverse(num,0));
    }
}
