import java.util.Arrays;
import java.util.Scanner;

public class InfiniteArray {
    private static int binarySearch(int[] arr, int key, int start, int end){
        while(start <= end){
            int mid = start + (end-start)/2;
            if(key < arr[mid]) end = mid - 1;
            else if(key > arr[mid]) start = mid + 1;
            else return mid;
        }
        return -1;
    }
    private static int findRange(int[] arr, int key){
        int start=0, end=1;
        while(key>arr[end]){
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
            if(end>=arr.length) {
                end = arr.length-1;
            }
        }
        return binarySearch(arr,key,start,end);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int[] arr = {0,1,1,2,3,4,5,5,6,7,8,8,9,9,23};
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        System.out.println("Given array: " + Arrays.toString(arr));
        System.out.print("Enter key: ");
        int key = input.nextInt();
        int index = findRange(arr,key);
        if(index==-1) System.out.println("Element not found..");
        else System.out.println("Element found at index: " + index);
    }
}
