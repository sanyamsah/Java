public class StringBuilderClass {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i<26; i++){
            char ch = (char)('a' + i);
            builder.append(ch); // changes made in the same object
            System.out.println(builder); // sout(builder.toString());
        }
        builder.reverse();
        System.out.println(builder);
    }
}
