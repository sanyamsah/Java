import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {7,8,23,5,7,8,54,2,4,8,9,3,40,23,1,56,32,56,3,22,4,6};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    private static void quickSort(int[] arr, int low, int high) {
        if(low >= high) return;
        int start = low, end = high;
        int mid = start + (end - start)/2;
        int pivot = arr[start];
        while(start <= end){
            while(arr[start] < pivot){
                start++;
            }
            while(arr[end] > pivot){
                end--;
            }
            if(start <= end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++; end--;
            }
        }
        quickSort(arr, low, end);
        quickSort(arr, start, high);
    }
}
