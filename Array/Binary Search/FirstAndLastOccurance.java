import java.util.Scanner;

public class FirstAndLastOccurance {
    private static int firstOccurrence(int[] arr, int target){
        int low = 0, high = arr.length - 1;
        int first = -1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(arr[mid] == target){
                first = mid;
                high = mid - 1;
            }
            else if(target > arr[mid]){
                low = mid + 1;
            } else{
                high = mid - 1;
            }
        }
        return first;
    }
    private static int lastOccurrence(int[] arr, int target){
        int low = 0, high = arr.length - 1;
        int last = -1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(arr[mid] == target){
                last = mid;
                low = mid + 1;
            }
            else if(target > arr[mid]){
                low = mid + 1;
            } else{
                high = mid - 1;
            }
        }
        return last;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,3,4,4,4,5,5,5,5,6,6,6,6,7};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter target: ");
        int target = input.nextInt();
        System.out.println("First occurrence: " + firstOccurrence(arr, target));
        System.out.println("Second occurrence: " + lastOccurrence(arr, target));
    }
}
