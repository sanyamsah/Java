import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String query = input.nextLine();
        String[] values = query.split(" ");
        System.out.println(Arrays.toString(values));
        query = input.nextLine();
        values = query.split(" ");
        System.out.println(Arrays.toString(values));
    }
}
