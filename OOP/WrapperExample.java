public class WrapperExample {

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }

    static void swap(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        swap(a,b); // pass by value
        System.out.println(a + " " + b); // doesn't change

        Integer x = 20;
        Integer y = 50;
        swap(x,y);
        System.out.println(x + " " + y); // doesn't change
        // Integer class is a 'final' class
        // final variables can't be changed
        final int n = 5;
    }
}
