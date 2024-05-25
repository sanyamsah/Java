import java.util.Arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] mat = new int[3][];
        int[][] mat2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] mat3 = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };
        for (int i = 0; i < mat3.length; i++) {
            // Loop through each column in the current row
            for (int j = 0; j < mat3[i].length; j++) {
                System.out.print(mat3[i][j] + " ");
            }
            System.out.println(); // Move to the next line after printing each row
        }
        System.out.println();
        for (int[] row : mat3) {
            // Enhanced loop for iterating over elements in each row
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0; i<mat3.length; i++){
            System.out.println(Arrays.toString(mat3[i]));
        }
        System.out.println();
        for(int[] arr : mat3){
            System.out.println(Arrays.toString(arr));
        }
    }
}
