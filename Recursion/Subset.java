public class Subset {
    public static void main(String[] args) {
        String str = "abc";
        subset("",str);
    }
    private static void subset(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subset(p + ch,up.substring(1)); // add it, or
        subset(p, up.substring(1)); // ignore it
    }
}
