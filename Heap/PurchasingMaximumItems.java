import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class PurchasingMaximumItems {
    private static int maxItems(int[] arr, int sum){ // O(n) complexity
        Arrays.sort(arr);
        int max = 0;
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            max += arr[i];
            if(max > sum){
                break;
            }
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
//        int[] cost = {1,12,5,111,200};
//        int sum = 10;
        int[] cost = {20,10,5,30,100};
        int sum = 35;
        System.out.println(maxItems(cost, sum));
    }
}
