import java.util.Scanner;

public class Primitives {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int integer = 25;
        char ch = 's';
        float f = 25.9f;
        double largeFloatNumber = 12345678.1234;
        long largeIntegerNumber = 123456789L;
        boolean val = true;
        int mil = 250_000_000;
        long bil = 250_000_000_000L;
        System.out.println("250 million: "+ mil);
        System.out.println("250 billion: "+ bil);
        System.out.print("Enter your roll number: ");
        int roll = input.nextInt();
        System.out.print("Your roll number is: "+roll);
    }
}
