import java.util.Scanner;

// HCF(a,b) = minimum value of the equation ax + by where x,y -> integers
// LCM(a,b) = minimum number that is divisible by both a and b
// Euclidean method
public class HCF_LCM {
    private static int hcf(int a, int b){
        if(a == 0) return b;
        return hcf(b % a, a);
    }
    private static int lcm(int a, int b){
        return (a * b) / hcf(a,b);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        if(a > b){
            int temp = a;
            a = b;
            b = temp;
        }
        System.out.println("HCF: " + hcf(a, b));
        System.out.println("LCM: " + lcm(a, b));
    }
}
