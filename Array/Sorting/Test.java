import java.util.Arrays;

public class Test {
    private static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
        private static void cycleSort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[correctIndex] != arr[i]){
                swap(arr, i, correctIndex);
            } else{
                i++;
            }
        }
    }
    private static void arrange(int[] arr, int[] brr){
        for(int i = 0; i < arr.length; i++){
            int correctIndex = arr[i];
            brr[correctIndex] = arr[i];
            System.out.println(brr[correctIndex]);
        }
    }
    private static int find(int[] brr){
        for(int i = brr.length - 1; i >= 0; i--){
            if(brr[i] == 0) return brr[i+1] - 1 ;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
//        cycleSort(arr);
//        System.out.println(Arrays.toString(arr));
        int[] brr = new int[arr.length + 1];
        arrange(arr, brr);
        System.out.println(Arrays.toString(brr));
        int res = find(brr);
        System.out.println(res);
    }
}
