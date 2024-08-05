public class Pattern3 {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 4 - i + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
