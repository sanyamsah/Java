import java.util.ArrayList;
import java.util.List;

public class SubsetArr {
    private static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int element : arr){
            int n = outer.size();
            for(int i = 0; i < n; i ++){
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(element);
                outer.add(inner);
            }
        }
        return outer;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        List<List<Integer>> list = subset(arr);
        System.out.println(list);
//        for(List<Integer> l : list){
//            System.out.println(l);
//        }
    }
}
