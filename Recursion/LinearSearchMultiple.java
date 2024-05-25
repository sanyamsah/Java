import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// Linear Search with multiple occurances
public class LinearSearchMultiple {
    static ArrayList<Integer> list = new ArrayList<>();
        private static void search(int[] arr, int key, int i){
            if(i==arr.length) return;
            if(arr[i]==key) list.add(i);
            search(arr,key,++i);
        }
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int[] arr = {1,5,8,9,3,0,6,7,9,8,10,13,13,25,99};
            System.out.println("Given array: " + Arrays.toString(arr));
            System.out.print("Enter key: ");
            int key = input.nextInt();
            search(arr,key,0);
            if(list.isEmpty()) System.out.println("Element not found..");
            else System.out.println("Element found at index: " + list);
        }
}
