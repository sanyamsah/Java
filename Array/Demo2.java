import java.util.Arrays;
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.print("Enter 5 integers: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = input.nextInt();
        }
        for(int element : arr){ // For each element in the array, print the element
            System.out.print(element + " "); // element: element of the array
        }
        System.out.println("\n" + Arrays.toString(arr));
    }
}
