import java.util.ArrayList;
import java.util.Scanner;

public class Search2DArray {
    private static ArrayList<ArrayList<Integer>> search(int[][] mat, int key){
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        if(mat.length==0) return list;
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
                if(mat[i][j]==key) {
                    ArrayList<Integer> indices = new ArrayList<>();
                    indices.add(i); indices.add(j);
                    list.add(indices);
                }
            }
        }
        return list;
    }
    private static void print2DArray(int[][] mat){
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] mat = {
                {1,2,3,4},
                {0,2,6,9},
                {65,3,5,78},
                {1,99,4},
                {31,45,67,45,8}
        };
        System.out.println("Given matrix..");
        print2DArray(mat);
        System.out.print("Enter element to search: ");
        int key = input.nextInt();
        ArrayList<ArrayList<Integer>> list = search(mat,key);
        if(list.isEmpty()) System.out.println("Element not found..");
        else if (list.size()==1) System.out.println("Element found at index: " + list);
        else System.out.println("Element found at indices: " + list);
    }
}
