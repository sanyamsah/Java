import java.util.Scanner;

// Find the sum of nth row of Meru Prastara (Pascal's Triangle)
public class MeruPrastara {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();
        System.out.println("Sum of nth row: " + (1 << n-1));
    }
}
