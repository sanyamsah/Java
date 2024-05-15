public class Performance {
    public static void main(String[] args) {
        String series = "";
        for(int i=0; i<26; i++) { // O(n^2) complexity & wastage of space
            char ch = (char) ('a' + i);
            series += ch; // String + character
            System.out.println(series);
        }
    }
}
