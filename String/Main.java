public class Main {
    public static void main(String[] args) {
        String name = "Sanyam Sah";
        // Datatype Reference variable = Object;
        System.out.println(name);
        String a = "Nepal";
        String b = "Nepal";
        System.out.println(a==b);
        // Both a & b are reference variables in the stack.
        // Both a & b point to an object "Nepal" in the heap.
        String str1 = new String("India");
        String str2 = new String("India");
        System.out.println(str1==str2); // false
        System.out.println(str1.equals(str2)); // true
        String str3 = str1;
        System.out.println(str1.equals(str2)); //true
        System.out.println((str1==str3)); //true
        System.out.println(name.charAt(0)); // S
    }
}
