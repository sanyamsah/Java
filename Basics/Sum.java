import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
//        int a = input.nextInt();
        float a = input.nextInt();
        System.out.print("Enter another number: ");
//        int b = input.nextInt();
        float b = input.nextInt();
        System.out.println(a+" + "+b+" = "+(a+b));
    }
}
