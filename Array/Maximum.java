import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Maximum {

    static int maximum(int[] arr){
        int max = Integer.MIN_VALUE;
        if(arr == null) return -1;
        for(int i=1; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    static int maxRange(int[] arr){
        Scanner input = new Scanner(System.in);
        int start, end;
        System.out.print("Enter range: ");
        start = input.nextInt();
        end = input.nextInt();
        if(end < start || arr==null) return -1;
        int max = arr[start];
        for(int i=start; i<=end; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n;
        n = input.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements: ");
        for(int i=0; i<arr.length; i++){
            arr[i]=input.nextInt();
        }
        System.out.println("Maximum element: " + maximum(arr));
        System.out.println("Maximum in given range: " + maxRange(arr));
    }
}
