public class WildCardMatching {
    public static void main(String[] args) {
//        String pattern = "ba*a?", str = "baaabab";
//        String pattern = "**c*", str = "abcd";
        String pattern = "a*ab", str = "baaabab";
        System.out.println(match(pattern, str, pattern.length() - 1, str.length() - 1));
    }
    private static boolean match(String pattern, String str, int i, int j){
        if(i < 0 && j < 0){
            return true;
        }
        if(i < 0 && j >= 0){
            return false;
        }
        if(j < 0 && i >= 0){
            for(int k = 0; k <= i; k++){
                if(pattern.charAt(k) != '*') return false;
            }
            return true;
        }
        if(pattern.charAt(i) == str.charAt(j) || pattern.charAt(i) == '?'){
            return match(pattern, str, i - 1, j - 1);
        }
        if(pattern.charAt(i) == '*'){
            return (match(pattern, str, i-1, j) || match(pattern, str, i, j-1));
        }
        else{
            return false;
        }
    }
}
