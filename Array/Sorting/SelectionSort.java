import java.util.Arrays;

public class SelectionSort {
    private static int maximum(int[] arr, int n){
        int max = 0;
        for(int k = 1; k <= n; k++){
            if(arr[k] > arr[max]) max = k;
        }
        return max;
    }
    private static void selectionSort(int[] arr){ // selects element and puts in right index
        for(int i = 0; i < arr.length; i++){
            int last = arr.length - i - 1;
            int max = maximum(arr, last);
            int temp = arr[max];
            arr[max] = arr[last];
            arr[last] = temp;
        }
    }
    private static void selectionSort(int[] arr, int n){ // recursion
        if(n == 1) return;
        int max = maximum(arr, n-1);
        int temp = arr[max];
        arr[max] = arr[n-1];
        arr[n-1] = temp;
        selectionSort(arr, --n);
    }
    public static void main(String[] args) {
        int[] arr = {1,5,2,4,3};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
        int[] brr = {5,4,3,2,1};
        selectionSort(brr, brr.length);
        System.out.println(Arrays.toString(brr));
    }
}
