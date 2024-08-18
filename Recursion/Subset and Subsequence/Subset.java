import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Time complexity: O(n * 2^n)
// Space complexity: O(n * 2^n)
public class Subset {
//    private static List<List<Integer>> subset(int[] arr){
//        List<List<Integer>> outer = new ArrayList<>();
//        outer.add(new ArrayList<>());
//        for(int element : arr){
//            int n = outer.size();
//            for(int i = 0; i < n; i ++){
//                List<Integer> inner = new ArrayList<>(outer.get(i));
//                inner.add(element);
//                outer.add(inner);
//            }
//        }
//        return outer;
//    }
    private static List<List<Integer>> subset(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0, end = 0;
        for(int i = 0; i < arr.length; i++){
            start = 0;
            if(i > 0 && arr[i] == arr[i-1]){
                start = end + 1;
            }
            end = outer.size() - 1;
            int n = outer.size();
            for(int j = start; j < n; j++){
                List<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }
        }
        return outer;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,3};
        List<List<Integer>> list = subset(arr);
        System.out.println(list);
//        for(List<Integer> l : list){
//            System.out.println(l);
//        }
    }
}
