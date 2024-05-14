import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, world!"); // When out is null, it prints in the command line
        // When out is assigned a file, it prints/writes in the file
        Scanner input = new Scanner(System.in); // Input can also be taken from file rather than System.in
        System.out.println("Enter an integer..");
        System.out.println(input.nextInt());
        System.out.println("Enter a string..");
        System.out.println(input.next());
//        System.out.println("Enter a sentence..");
//        System.out.println(input.nextLine());
    }
}
