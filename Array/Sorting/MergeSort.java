import java.util.Arrays;

public class MergeSort {
    private static int[] mergeSort(int[] arr){
        if(arr.length == 1) return arr;
        int mid = arr.length / 2;
        int[] first = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] second = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(first, second);
    }
    private static int[] merge(int[] first, int[] second){
        int i = 0, j = 0, idx = 0;
        int[] merged = new int[first.length + second.length];
        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                merged[idx++] = first[i++];
            }
            else{
                merged[idx++] = second[j++];
            }
        }
        while(i < first.length){
            merged[idx++] = first[i++];
        }
        while(j < second.length){
            merged[idx++] = second[j++];
        }
        return merged;
    }
    public static void main(String[] args) {
        int[] arr = {7,8,23,5,7,8,54,2,4,8,9,3,40,23,1,56,32,56,3,22,4,6};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
