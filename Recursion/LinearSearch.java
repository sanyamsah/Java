import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    private static int search(int[] arr, int key, int i){
        if(i == arr.length) return -1;
        if(arr[i] == key) return i;
        return search(arr,key,++i);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {1,5,8,9,3,0,6,7,9};
        System.out.println("Given array: " + Arrays.toString(arr));
        System.out.print("Enter key: ");
        int key = input.nextInt();
        int index = search(arr,key,0);
        if(index==-1) System.out.println("Element not found..");
        else System.out.println("Element found at index: " + index);
    }
}
