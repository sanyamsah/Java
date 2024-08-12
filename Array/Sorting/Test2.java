import java.util.Arrays;

class Test2 {
    public static int[] findErrorNums(int[] nums) { // cyclic sort
        int i = 0;
        while(i < nums.length){
            int correctIndex = nums[i] - 1;
            if(nums[correctIndex] != nums[i]){
                int temp = nums[correctIndex];
                nums[correctIndex] = nums[i];
                nums[i] = temp;
            }
            else{
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        int[] arr = new int[2];
        for(i = nums.length - 1; i >= 0; i--){
            System.out.println("i: " + i);
            System.out.println("nums[i]: " + nums[i]);
            if(nums[i] != i + 1){
                arr[0] = nums[i];
                arr[1] = nums[i] + 1;
                return arr;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }
}