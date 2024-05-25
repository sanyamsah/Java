import java.util.Arrays;

public class Sorted {
    private static boolean sorted(int[] arr, int i){
        if(i==arr.length-1) return true;
        return (arr[i]<arr[i+1] && sorted(arr, ++i));
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6}; // sorted
        int[] brr = {1,2,3,4,6,5};// not sorted
        System.out.print(Arrays.toString(arr) + ": ");
        if(sorted(arr, 0)){
            System.out.println("Sorted");
        }
        else{
            System.out.println("Not sorted");
        }
        System.out.print(Arrays.toString(brr) + ": ");
        if(sorted(brr, 0)){
            System.out.println("Sorted");
        }
        else{
            System.out.println("Not sorted");
        }
    }
}
