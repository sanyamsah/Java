import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5]; // roll is pointing to an array object of integer type elements
        System.out.print("Enter 5 integers: ");
        for(int i=0; i<arr.length; i++){
            arr[i]=input.nextInt();
        }
        for(int i=0; i<5; i++){
            System.out.print(arr[i]+" ");
        }
        // Declaration of array; array is being defined in the stack at compile time.
        /* Datatype */ int[] array; /* Reference variable */
        array = new int[5]; // Object is being created in the heap at run time. (initialization)
        // Dynamic memory allocation.
    }
}