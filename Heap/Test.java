import java.util.Arrays;

public class Test {

    // Method to build a max-heap
    public static void buildMaxHeap(int[] arr) {
        int n = arr.length;
        // Start from the last non-leaf node and heapify each node
        for (int i = n / 2 - 1; i >= 0; i--) {
            maxHeapify(arr, n, i);
        }
    }

    // Method to maintain the max-heap property
    private static void maxHeapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            maxHeapify(arr, n, largest);
        }
    }

    // Main method to perform heap sort
    public static void heapSort(int[] arr) {
        int n = arr.length;

        // Build a max-heap
        buildMaxHeap(arr);

        // Extract elements one by one from the heap
        for (int i = n - 1; i >= 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Call maxHeapify on the reduced heap
            maxHeapify(arr, i, 0);
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 10, 3, 5, 1};
        System.out.println("Original array: " + Arrays.toString(arr));
        heapSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
