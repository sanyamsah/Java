import java.util.Scanner;

public class SkipCharacter {
//    private static String skip(String p, String up, char ch){ // processed, unprocessed
//        if(up.isEmpty()) return p;
//        char c = up.charAt(0);
//        if(c != ch){
//            return skip(p + c, up.substring(1), ch);
//        } else{
//            return skip(p, up.substring(1), ch);
//        }
//    }
//    private static String skip(String up, char ch){
//        String p = "";
//        return skip(p, up, ch);
//    }

    private static String skip(String up, char ch){
        if(up.isEmpty()) return "";
        char c = up.charAt(0);
        if(ch == c){
            return skip(up.substring(1), ch);
        } else{
            return c + skip(up.substring(1), ch);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        System.out.print("Enter character to remove: ");
        char ch = input.next().charAt(0);
        System.out.println(skip(str, ch));
    }
}
