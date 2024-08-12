import java.util.Scanner;

public class CountZeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter multi-digit number: ");
        long num = input.nextLong();
        int count = 0;
        System.out.println("Number of zeros: " + countZeros(num, count));
    }

    private static int countZeros(long num, int count) {
        if(num == 0) return count;
        return (num % 10 == 0)
                ? countZeros(num / 10, ++count)
                : countZeros(num / 10, count);
    }
}
