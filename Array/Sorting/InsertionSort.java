import java.util.Arrays;

public class InsertionSort {
    private static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    private static void insertionSort(int[] arr){
        for(int i = 0; i < arr.length-1; i++){
            for(int j = i+1; j > 0; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                } else{
                    break; // as the sub-array is already sorted
                }
            }
        }
    }
    private static void insertionSort(int[] arr, int i){
        if(arr.length == 0) return;
        if(i == arr.length-1) return;
        for(int j = i + 1; j > 0; j--){
            if(arr[j] < arr[j-1]){
                swap(arr, j, j-1);
            }
            else{
                break;
            }
        }
        insertionSort(arr, ++i);
    }
    public static void main(String[] args) {
        int[] arr = {5,1,4,2,3};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
        int[] brr = {1,2,3,4,5,0,9,8,7,6};
        insertionSort(brr, 0);
        System.out.println(Arrays.toString(brr));
    }
}
