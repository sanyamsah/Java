@FunctionalInterface
interface OuterClass{
    void show();
}

@FunctionalInterface
interface ClassWithValue{
    void showValue(int i);
}

@FunctionalInterface
interface Add{
    int add(int a, int b);
}

public class LambdaExpression {
    public static void main(String[] args) {
        // OuterClass obj = () -> System.out.println("In lambda expression show..");
        // obj.show();

        OuterClass obj = () -> {
            System.out.println("Hello!");
            System.out.println("In lambda expression show..");
        };
        obj.show();

        // ClassWithValue obj2 = (int i) -> {
        //     System.out.println("Hello!");
        //     System.out.println("The passed value is: " + i);
        // };

        // ClassWithValue obj2 = (i) -> {
        //     System.out.println("Hello!");
        //     System.out.println("The passed value is: " + i);
        // };

        ClassWithValue obj2 = i -> {
            System.out.println("Hello!");
            System.out.println("The passed value is: " + i);
        };
        obj2.showValue(25);

        // Add obj3 = (int a, int b) -> {
        //     return a + b;
        // };
        // int result = obj3.add(2,5);
        // System.out.println("Sum = " + result);

        Add obj3 = (a,b) -> a + b;
        int result = obj3.add(2,5);
        System.out.println("Sum = " + result);
    }
}