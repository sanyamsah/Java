import java.util.Arrays;
import java.util.Scanner;

public class DiceAndTarget {
    private static long diceRolls(String p, long target, long faces, long numDie){
        if(target == 0 && numDie == 0){
            System.out.println(p);
            return 1;
        }
        long count = 0;
        for(long i = 1; i <= target && i <= faces; i++){
            count += diceRolls(p + i, target-i, faces, numDie-1);
        }
        return count % 1000000007;
    }
//    private static long diceRolls(String p, long target, long faces, long numDie, long[][]dp){
//        if(dp[(int) target][(int) numDie] != -1){
//            return dp[(int) target][(int) numDie];
//        }
//        if(target == 0 && numDie == 0){
//            System.out.println(p);
//            return 1;
//        }
//        if(target == 0 || numDie == 0){
//            return 0;
//        }
//        long count = 0;
//        for(long i = 1; i <= target && i <= faces; i++){
//            count += diceRolls(p + i, target-i, faces, numDie-1, dp) % 1000000007;
//        }
//        dp[(int) target][(int) numDie] = count;
//        return count;
//    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long faces = 6;
        long numDie = 3;
        System.out.print("Enter target sum: ");
        long target = input.nextLong();
        long[][] dp = new long[(int) (target+1)][(int) (numDie+1)];
        for (long[] ints : dp) {
            Arrays.fill(ints, -1);
        }
        System.out.println("Count: " + diceRolls("", target, faces, numDie));
    }
}
