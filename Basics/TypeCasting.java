import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        float num = input.nextFloat();
        System.out.println(num);
        // If num = 25, output = 25.5
        // Destination size/type > Source size/type
        // Type casting: integer to float
        // Converting float to int explicitly: Narrowing conversion
        int n = (int)(25.0525f); // Type Casting
        System.out.println(n);
        int a = 257;
        byte b = (byte)(a);
        System.out.println(b); // 257 % 256 = 1
        a = 256;
        b = (byte)(a);
        System.out.println(b); // 256 % 256 = 0
        a = 255;
        b = (byte)(a);
        System.out.println(b);

        // Automatic type promotion in expressions
        byte num1 = 4;
        byte num2 = 5;
        byte num3 = 10;
        int exp = num1 * num2 / num3;
        System.out.println(exp); // output = 2

        // int & char
        int ch = 'A';
        System.out.println(ch); // 65
        ch = 'a';
        System.out.println(ch); // 97
    }
}

// Suggestion: learn about the rules of type promotion.
// Example: integer * float = float, 