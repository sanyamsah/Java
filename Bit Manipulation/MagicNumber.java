import java.util.Scanner;

// Find nth magic number
public class MagicNumber {
    private static int magicNumber(int n){
        int base = 5;
        int ans = 0;
        while(n > 0){
            int last = n & 1;
            n = n >> 1;
            ans += last * base;
            base *= 5;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n to find nth magic number: ");
        int n = input.nextInt();
        if(n == 1) System.out.println(n + "st magic number: " + magicNumber(n));
        else if(n == 2) System.out.println(n + "nd magic number: " + magicNumber(n));
        else System.out.println(n + "th magic number: " + magicNumber(n));
    }
}
