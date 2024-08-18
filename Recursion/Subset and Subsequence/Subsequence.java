import java.util.ArrayList;
import java.util.Scanner;

public class Subsequence {
    private static ArrayList<String> subsets(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> take = subsets(p + ch, up.substring(1));
        ArrayList<String> ignore = subsets(p, up.substring(1));
        take.addAll(ignore);
        return take;
    }
    private static void subsets(String str){
        System.out.println(subsets("",str));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = input.next();
        subsets(str);
    }

//    private static void subsets(String p, String up){
//        if(up.isEmpty()){
//            System.out.print(p + " ");
//            return;
//        }
//        char ch = up.charAt(0);
//        subsets(p + ch, up.substring(1));
//        subsets(p, up.substring(1));
//    }
//    private static void subsets(String p, String up, ArrayList<String> list){
//        if(up.isEmpty()){
//            list.add(p);
//            return;
//        }
//        char ch = up.charAt(0);
//        subsets(p + ch, up.substring(1), list);
//        subsets(p, up.substring(1), list);
//    }
//    private static ArrayList<String> subsets(String str){
//        ArrayList<String> list = new ArrayList<>();
//        String sub = "";
//        subsets(sub, str, list);
//        return list;
//    }
}
