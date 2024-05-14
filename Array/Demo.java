import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for(int i=0; i<5; i++){
            System.out.print(arr[i]+" ");
        }
        int[] brr = new int[5];
        System.out.println();
        for(int i=0; i<5; i++){
            System.out.print(brr[i]+" ");
        }
        float[] crr = new float[5];
        System.out.println();
        for(int i=0; i<5; i++){
            System.out.print(crr[i]+" ");
        }
        double[] drr = new double[5];
        System.out.println();
        for(int i=0; i<5; i++){
            System.out.print(drr[i]+" ");
        }

    }
}
