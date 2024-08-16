import java.util.ArrayList;
import java.util.Scanner;

public class Factor {
    private static ArrayList<Long> factors(long n){
        ArrayList<Long> list = new ArrayList<>();
        for(long i = 1; i*i <= n; i++){
            if(n % i == 0){
                if(n / i == i){
                    list.add(i);
                } else{
                    list.add(i); list.add(n/i);
                }
            }
        }
        return list;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        long num = input.nextLong();
        System.out.println(factors(num));
    }
}
