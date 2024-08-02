import java.util.Arrays;

public class CycleSort {
    private static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    private static int findMaxIndex(int[] arr){
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > arr[max]) max = i;
        }
        return max;
    }
    private static void cycleSort(int[] arr){
        if(arr.length == 0) return;
        int diff = arr[findMaxIndex(arr)] - (arr.length - 1);
        for(int i = 0; i < arr.length; i++){
            swap(arr, i, arr[i] - diff);
        }
    }
//    private static void cycleSort(int[] arr){
//        int i = 0, diff = arr[findMaxIndex(arr)] - (arr.length - 1);
//        while(i < arr.length){
//            int correctIndex = arr[i] - diff;
//            if(arr[correctIndex] != arr[i]){
//                swap(arr, i, correctIndex);
//            } else{
//                i++;
//            }
//        }
//    }
    public static void main(String[] args) {
        int[] arr = {99,94,93,96,98,97,95}; // within a range, jumbled, non repeating
//        int[] arr = {3,5,2,1,4}; // worst case
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
        int[] brr = {56,55,54,53,52,51};
        cycleSort(brr);
        System.out.println(Arrays.toString(brr));
    }
}
