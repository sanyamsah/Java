import java.util.Scanner;

// Find the number of digits a number has in base-b.
// For example, 6 in base 10 has 1 and base 2 has 3 digits (110).
public class NumberOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base: ");
        int base = input.nextInt();
        System.out.print("Enter number: ");
        int num = input.nextInt();
        int digits = (int) (Math.log(num) / Math.log(base)) + 1;
        System.out.println("Number of digits in " + num + " for base " + base + " = " + digits);
    }
}
