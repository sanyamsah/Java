import java.util.ArrayList;
import java.util.Scanner;

public class ListOfLists {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        //initialization
        for(int i=0; i<3; i++){
            list.add(new ArrayList<>());
        }
        System.out.print("Enter 9 elements to the matrix: ");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                list.get(i).add(input.nextInt());
            }
        }
        for(int i=0; i<3; i++){
            System.out.println(list.get(i));
        }
    }
}
