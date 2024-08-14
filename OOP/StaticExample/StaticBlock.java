package StaticExample;

public class StaticBlock {
    static int a = 2;
    static int b;

    // will run only once when first object is created, when the class is loaded
    static{
        System.out.println("Static block executed.");
        b = a * 10 + 5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b); // 2 25
        StaticBlock obj2 = new StaticBlock();
        StaticBlock.a = 3;
        System.out.println(StaticBlock.a + " " + StaticBlock.b); // 3 25
    }
}
