import java.io.FileReader;
import java.io.IOException;

public class FileReadWrite {
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("demo.txt");
            int letter = fr.read();
            while(fr.ready()){
                System.out.print((char)letter);
                letter = fr.read();
            }
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
