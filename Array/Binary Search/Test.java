import java.util.Arrays;
import java.util.Scanner;

public class Test {
    private static int binarySearch(int[] arr, int key, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            try {
                if (key < arr[mid]) {
                    end = mid - 1;
                } else if (key > arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                end = mid - 1; // Adjust the end index if mid is out of bounds
            }
        }
        return -1;
    }

    private static int findRange(int[] arr, int key) {
        int start = 0, end = 1;
        // Increase end to find the range where the key could be
        while (true) {
            try {
                if (arr[end] >= key) {
                    break;
                }
                int temp = end + 1;
                end = end + (end - start + 1) * 2;
                start = temp;
            } catch (ArrayIndexOutOfBoundsException e) {
                // Adjust the end index if it goes out of bounds
                end = (end + start) / 2;
                break;
            }
        }
        return binarySearch(arr, key, start, end);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        System.out.println("Given array: " + Arrays.toString(arr));
        System.out.print("Enter key: ");
//        int key = input.nextInt();
        int key = 170;
        int index = findRange(arr, key);
        if (index == -1) {
            System.out.println("Element not found..");
        } else {
            System.out.println("Element found at index: " + index);
        }
    }
}
