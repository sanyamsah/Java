import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for(int i = 0; i < 5; i++){
            arr[i] = input.nextLine();
        }
        System.out.println(Arrays.toString(arr));
    }
}
