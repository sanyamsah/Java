import java.util.Scanner;

public class Palindrome {
    private static long reverse(long n, long rev){
        if(n == 0) return rev;
        long rem = n % 10;
        rev = rev * 10 + rem;
        return reverse(n/10, rev);
    }
    private static boolean isPalindrome(long n){
        return (n == reverse(n, 0));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a multi-digit number: ");
        long num = input.nextInt();
        if(isPalindrome(num)) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
}
