import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// Linear Search with multiple occurances
public class LinearSearchMultiple {
    static ArrayList<Integer> list = new ArrayList<>();
        private static void search(int[] arr, int key, int i){
            if(i == arr.length) return;
            if(arr[i] == key) list.add(i);
            search(arr, key, ++i);
        }
        // Passing list as argument
        private static ArrayList<Integer> search(int[] arr, int key, int i, ArrayList<Integer> l){
            if(i == arr.length) return l;
            if(arr[i] == key) l.add(i);
            return search(arr, key, ++i, l);
        }
        // Without passing list as argument
        private static ArrayList<Integer> search2(int[] arr, int key, int i){
            ArrayList<Integer> list = new ArrayList<>();
            if(i == arr.length) return list;
            if(arr[i] == key) list.add(i);
//            ArrayList<Integer> ansFromBelowCalls = search2(arr,key,++i);
//            list.addAll(ansFromBelowCalls);
            list.addAll(search2(arr,key,++i));
            return list;
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
            ArrayList<Integer> l = search(arr,key,0,new ArrayList<>());
            System.out.println(l);
            if(l.isEmpty()) System.out.println("Element not found..");
            else System.out.println("Element found at index: " + l);
            ArrayList<Integer> list2 = search2(arr,key,0);
            System.out.println(list2);
            if(list2.isEmpty()) System.out.println("Element not found..");
            else System.out.println("Element found at index: " + list2);

        }
}
