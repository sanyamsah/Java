import java.util.Arrays;

public class HeapSort {
    private static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    private static void maxHeapify(int[] arr, int i, int last){
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if(left <= last && arr[left] > arr[largest]) largest = left;
        if(right <= last && arr[right] > arr[largest]) largest = right;
        if(largest != i) {
            swap(arr, i, largest);
            maxHeapify(arr, largest, last);
        }
    }
    private static void buildMaxHeap(int[] arr){
        int last = arr.length - 1;
        for(int i = (last-1)/2; i >= 0; i--){
            maxHeapify(arr, i, last);
        }
    }
    private static void heapSort(int[] arr){
        int last = arr.length - 1;
        buildMaxHeap(arr);
        for(int i = last; i >= 1; i--){
            swap(arr, 0, i);
            maxHeapify(arr, 0, i-1);
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
