import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Permutations {
    private static int permutations(String p, String up, List<String> list){
        if(up.isEmpty()){
            list.add(p);
            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);
        for(int i = 0; i <= p.length(); i++){
            String f = p.substring(0, i);
            String s = p.substring(i); // p.substring(i, p.length());
            count += permutations(f + ch + s, up.substring(1), list);
        }
        return count;
    }
    private static List<String> permutations(String str){
        List<String> list = new ArrayList<>();
        int count = permutations("", str, list);
        System.out.println("Count: " + count);
        return list;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.next();
        System.out.println("Permutations: " + permutations(str));
    }
}
