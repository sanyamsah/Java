import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Sanyam Sah";
        char[] ch = name.toCharArray();
        System.out.println(Arrays.toString(ch));
        System.out.println(name.charAt(0));
        System.out.println(name.indexOf('h'));
        System.out.println("   Sanyam   ".strip());
        System.out.println(Arrays.toString(name.split(" "))); // returns array of strings
    }
}
