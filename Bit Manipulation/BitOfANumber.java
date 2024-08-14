public class BitOfANumber {
    public static void main(String[] args) {
        // get ith bit of a number
        int bin = 0b10110110;
        System.out.println(bin & (1 << 4)); // i = 5, (i-1) = 4

        // set ith bit of a number
        bin = 0b1010110;
        System.out.println(bin | (1 << 4));

        // reset ith bit of a number
        bin = 0b1010110;
        System.out.println(bin & ~(1 << 4));
    }
}
