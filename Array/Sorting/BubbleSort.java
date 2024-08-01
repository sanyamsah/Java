import java.util.Arrays;

public class BubbleSort { // sinks largest value to the end
    public static void main(String[] args) {
        int[] arr = {5,4,1,3,2};
//        int[] arr = {1,2,3,4,5}; // sorted, check for boolean swap
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
//        int[] brr = {6,7,8,9,10};
        int[] brr = {10,9,6,8,7};
        bubbleSort(brr, brr.length);
        System.out.println(Arrays.toString(brr));
    }
    private static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            boolean swap = false;
            for (int j = 1; j < n - i; j++) {
                if (arr[j] < arr[j - 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j - 1];
//                    arr[j - 1] = temp;
                    arr[j] = arr[j] ^ arr[j-1];      // XOR a and b, store result in a
                    arr[j-1] = arr[j] ^ arr[j-1];      // XOR a (now containing the original b) and b again
                    arr[j] = arr[j] ^ arr[j-1];      // XOR a (now containing the original a) and b again
                    swap = true;
                }
            }
            if(!swap) break;
        }
    }
    private static void bubbleSort(int[] arr, int n) { // recursive approach
        if(n==1) return;
        boolean swap = false;
        for(int i = 0; i < n-1; i++){
            if(arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                swap = true;
            }
        }
        if(!swap) return;
        bubbleSort(arr, --n);
    }
}
