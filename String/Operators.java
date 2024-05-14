import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'z');
        System.out.println("a" + "b");
        System.out.println('a' + 5);
        System.out.println((char)('a' + 5));
        System.out.println("a" + 25);
        // integer is converted to Integer that calls toString()
        String ans = new Integer(25) + "" + new ArrayList<>();
        System.out.println(ans);
    }
}
