public class StringBufferClass {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Sanyam");
        System.out.println(sb.length());
        System.out.println(sb);
        sb.append(" Sah");
        System.out.println(sb);
        String str = sb.toString();
        System.out.println(str);
        sb.insert(0, "Java ");
        System.out.println(sb);
        sb.setLength(30);
        System.out.println(sb.length());
        sb.ensureCapacity(100);
        System.out.println(sb.length());
    }
}
