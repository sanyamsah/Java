import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
    static void reverse(int[] arr){
        int j = arr.length-1;
        for(int i=0; i<arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            --j;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n;
        n = input.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements: ");
        for(int i=0; i<arr.length; i++){
            arr[i]=input.nextInt();
        }
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
}
