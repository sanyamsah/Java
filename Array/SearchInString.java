import java.util.Scanner;

public class SearchInString {
    private static int search(String str, char ch){
        if(str.isEmpty()) return -1;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == ch) return i;
        }
        return -1;
    }
    private static int search(String str){
        if(str.isEmpty()) return -1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter character to search: ");
        char key = input.next().charAt(0);
        for(char ch : str.toCharArray()){
            if(ch == key) return str.indexOf(ch);
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = "Sanyam Sah";
        System.out.println("Given string: " + str);
        System.out.print("Enter character to search: ");
        char ch = input.next().charAt(0);
        int index = search(str,ch);
        if(index==-1) System.out.println("Element not found..");
        else System.out.println("Element found at index: " + index);
        index = search(str);
        if(index==-1) System.out.println("Element not found..");
        else System.out.println("Element found at index: " + index);
    }
}
