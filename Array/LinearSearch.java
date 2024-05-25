import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    private static int search(int[] arr, int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==key) return i;
        }
        return -1;
    }
    private static ArrayList<Integer> searchMultipleIndices(int[] arr, int key){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(arr[i]==key) list.add(i);
        }
        return list;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {1,8,0,9,8,1,2,7,3,7,4,5,6,9,1,5,8,5};
        System.out.println("Given array: " + Arrays.toString(arr));
        System.out.print("Enter key: ");
        int key = input.nextInt();
        int index = search(arr,key);
        if(index==-1) System.out.println("Element not found..");
        else System.out.println("Element found at index: " + index);
        ArrayList<Integer> list = searchMultipleIndices(arr,key);
        if(list.isEmpty()) System.out.println("Element not found..");
        if(list.size()==1) System.out.println("Element found at index: " + list);
        else System.out.println("Element found at indices: " + list);
    }
}
