import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// no multiple of a particular number is prime
// Sieve of Eratosthenes
public class PrimesTillN {
    private static List<Integer> primes(boolean[] seive){
        List<Integer> list = new ArrayList<>();
        for(int i = 2; i * i <= seive.length - 1; i++){
            if(!seive[i]){
                for(int j = i * 2; j <= seive.length - 1; j += i){
                    seive[j] = true;
                }
            }
        }
        for(int i = 2; i < seive.length; i++){
            if(!seive[i]) list.add(i);
        }
        return list;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = input.nextInt();
        boolean[] seive = new boolean[n+1];
        List<Integer> list = primes(seive);
        System.out.println(list);
    }
}
