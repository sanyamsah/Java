import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    private static int binarySearch(int[] arr, int key, int low, int high){
        if(key < arr[low] || key > arr[high]) return -1;
        int mid = (low + high)/2;
        if(arr[mid] == key) return mid;
        else if(key < arr[mid]) return binarySearch(arr,key,0,mid);
        else if(key > arr[mid]) return binarySearch(arr,key,mid + 1,high);
        else return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,7,9,10,15,17,29,30,35,49,50,67,89};
        System.out.println("Given array: " + Arrays.toString(arr));
        Scanner input = new Scanner(System.in);
        System.out.print("Enter element to search: ");
        int key = input.nextInt();
        int index = binarySearch(arr,key, 0, arr.length-1);
        if(index == -1) System.out.println("Element not found");
        else System.out.println("Element found at index: " + index);
    }
}
