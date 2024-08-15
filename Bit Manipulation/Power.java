import java.util.Scanner;

public class Power {
    private static int power(int base, int pow){
        int ans = 1;
        while(pow > 0){
            if((pow & 1) == 1){
                ans *= base;
            }
            base *= base;
            pow >>= 1;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base: ");
        int base = input.nextInt();
        System.out.print("Enter power: ");
        int pow = input.nextInt();
        System.out.println(base + " ^ " + pow + " = " + power(base, pow));
    }
}
