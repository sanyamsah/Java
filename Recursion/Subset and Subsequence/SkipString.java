import java.util.Scanner;

public class SkipString {
    private static String skip(String str, String substr){
        if(str.isEmpty()) return "";
        if(str.startsWith(substr)){
            return skip(str.substring(substr.length()), substr);
        } else{
            return str.charAt(0) + skip(str.substring(1), substr);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        System.out.print("Enter substring to remove: ");
        String substr = input.next();
        System.out.println(skip(str, substr));
    }
}
