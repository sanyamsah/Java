import java.util.Scanner;

public class Palindrome {
    private static int reverse(int n, int rev){
        if (n == 0) return rev;
        int rem = n % 10;
        rev = rev * 10 + rem;
        return reverse(n / 10, rev);
    }
    private static boolean isPalindrome(int n){
        return (n == reverse(n,0));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a multi-digit number: ");
        int num = input.nextInt();
        if(isPalindrome(num)) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
}
