import java.util.ArrayList;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> list = subset(arr);
        for(List<Integer> li : list){
            System.out.println(li);
        }
    }
    private static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int element : arr){
            System.out.println("Element: " + element);
            int n = outer.size();
            System.out.println("Size: " + n);
            for(int i=0; i<n; i++){
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(element);
                outer.add(inner);
            }
        }
        return outer;
    }
}
