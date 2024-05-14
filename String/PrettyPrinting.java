public class PrettyPrinting {
    public static void main(String[] args) {
        float a = 123.123456f;
        String name = "Sanyam";
        System.out.printf("Formatted number: %.3f", a); //123.123
        System.out.println();
        System.out.println(Math.PI);
        System.out.printf("Pi: %.2f", Math.PI); //3.14
        System.out.printf("My name is %s", name);
    }
}
// Learn about placeholders in Java.