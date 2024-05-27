import java.util.Scanner;

public class Palindrome {
    static boolean isPalindrome(String str){
        if(str == null || str.isEmpty()) return true;
        str = str.toLowerCase();
        int j = str.length() - 1;
        for(int i=0; i<=str.length()/2; i++){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String s = input.next();
        System.out.print(s + ": ");
        if(isPalindrome(s)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
