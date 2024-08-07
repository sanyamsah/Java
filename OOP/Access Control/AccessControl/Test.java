import java.util.ArrayList;

public class Test {
    int num;
    int[] arr;
    Test(int num){
        this.num = num;
        this.arr = new int[num];
    }

    public static void main(String[] args) {
        ArrayList<Test> test = new ArrayList<>();
//        test.DEFAULT_CAPACITY; // can't be accessed, private
        test.add(new Test(20));
        System.out.println(test);
    }
}
