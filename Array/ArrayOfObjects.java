import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfObjects {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] str = new String[5]; // Array of strings
        System.out.print("Enter 5 strings: ");
        for (int i = 0; i < str.length; i++) {
            str[i] = input.next();
        }
        System.out.println("\n" + Arrays.toString(str));
    }
}
