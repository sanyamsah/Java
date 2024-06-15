import java.util.Arrays;
import java.util.Scanner;

public class Floor {
   // Greatest element in the array that is smaller than or equal to the target element.
        private static int floor(int[] arr, int key){
            int start = 0, end = arr.length - 1;
            while(start <= end){
                int mid = start + (end - start) / 2;
                if(arr[mid] == key) return mid;
                else if(key < arr[mid]) end = mid - 1;
                else start = mid + 1;
            }
            return end;
        }
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int[] arr = {0,1,1,2,3,4,6,7,8,8,9,9,10,13,15,17,23};
            System.out.println("Given array: " + Arrays.toString(arr));
            System.out.print("Enter key: ");
            int key = input.nextInt();
            int index = floor(arr,key);
            System.out.println("Element found at index: " + index);
            System.out.println("Element closest to " + key + " = " + arr[index]);
        }
    }