import java.util.Arrays;
import java.util.Scanner;

public class RotatedBinarySearch {
    private static int search(int[] arr, int key, int start, int end){
        if(start > end) return -1;
        int mid = start + (end - start) / 2;
        if(arr[mid] == key) return mid;
        if(arr[start] <= arr[mid]){
            if(key >= arr[start] && key <= arr[mid]){
                return search(arr,key,start,mid);
            }
            else return search(arr,key,mid+1,end);
        }
        if(key >= arr[mid] && key <= arr[end]) return search(arr,key,mid,end);
        return search(arr,key,start,mid);
    }
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int[] arr = {5,7,19,43,50,67,1,2,3,4};
        System.out.println("Given array: " + Arrays.toString(arr));
        System.out.print("Enter key: ");
        int key = input.nextInt();
        int index = search(arr,key,0,arr.length-1);
        if(index==-1) System.out.println("Element not found..");
        else System.out.println("Element found at index: " + index);
    }
}
