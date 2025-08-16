@FunctionalInterface
interface OuterClass{
    void show();
}

public class LambdaExpression {
    public static void main(String[] args) {
        // OuterClass obj = () -> System.out.println("In lambda expression show..");
        // obj.show();
        OuterClass obj = () -> {
            System.out.println("In lambda expression show..");
            System.out.println("Hello!");
        };
        obj.show();
    }
}