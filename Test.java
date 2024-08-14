import java.util.*;
import java.lang.*;

class Test
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner input = new Scanner(System.in);
        while(true){
            int n = input.nextInt();
            if(n == 42) break;
            System.out.println(n);
        }
    }
}