import java.util.Scanner;

// Binary representation of a number that is power of 2 contains only one 1 and rest 0
public class PowerOf2 {
    private static boolean isPowerOf2(int num){
        if(num == 0) return false;
//        int count = 0;
//        while(num > 0){
//            int last = num & 1;
//            if(last == 1) count++;
//            if(count > 1) return false;
//            num = num >> 1;
//        }
//        return true;
        return ((num & (num - 1)) == 0);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = input.nextInt();
        System.out.println(isPowerOf2(num));
    }
}
