public class Prime {
    public static void main(String[] args) {
        for(int i = 0; i <= 30; i++){
            if (isPrime(i)) {
                System.out.println(i + ": Prime");
            } else {
                System.out.println(i + ": Composite");
            }
        }
    }
    private static boolean isPrime(int num) {
        if(num <= 1) return false;
        for(int i = 2; i <= (int)Math.sqrt(num); i++){
            if(num % i == 0) return false;
        }
        return true;
    }
}
