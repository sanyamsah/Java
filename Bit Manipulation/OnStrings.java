public class OnStrings {
    public static void main(String[] args) {
//        String str = "1C0C1C1A0B1";
        String str = "0C1A1B1C1C1B0A0";
        System.out.println(operate(str));
    }
    private static int operate(String str){
        if(str.isEmpty()) return -1;
        int result = str.charAt(0) - '0';
        for(int i = 1; i < str.length(); i+=2){
            int operand = str.charAt(i+1) - '0';
            if(str.charAt(i) == 'A'){
                result &= operand;
            } else if(str.charAt(i) == 'B'){
                result |= operand;
            } else{
                result ^= operand;
            }
        }
        return result;
    }
}
