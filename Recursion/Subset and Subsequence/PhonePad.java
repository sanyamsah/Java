import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class PhonePad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter combination: ");
        String digits = input.next();
        List<String> list = new ArrayList<>();
        pad("",digits,list);
        System.out.println(list);
    }
    private static void pad(String p, String up, List<String> list){
        if(up.isEmpty()){
            list.add(p);
            return;
        }
        int i, len;
        int digit = up.charAt(0) - '0';
        i = (digit - 2) * 3;
        if(digit > 7) i += 1;
        len = i + 3;
        if(digit == 7 || digit == 9) len += 1;
        for(; i < len; i++){
            char ch = (char)('a' + i);
            pad(p + ch, up.substring(1), list);
        }
    }
}