import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    private static int binarySearch(int[] arr, int key){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(key < arr[mid]) end = mid - 1;
            else if(key > arr[mid]) start = mid + 1;
            else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {0,1,1,2,3,4,5,5,6,7,8,8,9,9,23};
        System.out.println("Given array: " + Arrays.toString(arr));
        System.out.print("Enter key: ");
        int key = input.nextInt();
        int index = binarySearch(arr,key);
        if(index==-1) System.out.println("Element not found..");
        else System.out.println("Element found at index: " + index);
    }
}
