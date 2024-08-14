package AccessControl;

public class Main {
    public static void main(String[] args) {
        Test test = new Test(10, 2, 5);
//        System.out.println(test.num); // private, can't be accessed outside file
        System.out.println(test.a);
    }
}
