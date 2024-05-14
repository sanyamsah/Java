import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> aList = new ArrayList<>(10);
        // Here, Integer: wrapper class
        aList.add(1);
        aList.add(2);
        aList.add(3);
        aList.add(4);
        aList.add(5);
        System.out.println(aList);
        System.out.println(aList.contains(5));
        aList.set(0,6);
        System.out.println(aList);
        aList.remove(0);
        System.out.println(aList);
        aList.add(0,1);
        System.out.println(aList);
        System.out.print("Enter 5 more elements: ");
        for(int i=0; i<5; i++){
            aList.add(input.nextInt());
        }
        System.out.println(aList);

        // Fetching an element at a particular index:
        System.out.println(aList.get(4));
//        Object[] arr=aList.toArray();
//        System.out.println(arr.toString());
    }
}
