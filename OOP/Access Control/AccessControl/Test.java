package AccessControl;

import java.util.ArrayList;

public class Test {
    private int num;
    protected int a;
    public int b;
    int[] arr;
    Test(int num, int a, int b){
        this.num = num;
        this.a = a;
        this.b = b;
        this.arr = new int[num];
    }

    public static void main(String[] args) {
        ArrayList<Test> test = new ArrayList<>();
//        test.DEFAULT_CAPACITY; // can't be accessed, private
        test.add(new Test(20, 1,2));
        System.out.println(test);
    }
}
