import java.util.Scanner;

public class OddOrEven {
    private static boolean isOdd(int num){
        return ((num & 1) == 1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        if(isOdd(num)) System.out.println("Odd");
        else System.out.println("Even");
    }
}
