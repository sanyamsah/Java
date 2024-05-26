import java.util.Scanner;

public class Minimum {
    private static int minimum(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {1,8,9,8,1,2,7,3,7,4,5,6,9,1,5,8,5};
        System.out.println("Minimum element: " + minimum(arr));
    }
}
