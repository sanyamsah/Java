// Given an array of numbers, every number appears twice except one. Find that.
public class UniqueNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,2,1,3,99,4,0,0};
        int xor = 0;
        for(int element : arr){
            xor ^= element;
            // element ^ element = 0
            // element ^ 0 = element
            // associative property, order doesn't matter
        }
        System.out.println(xor);
    }
}
