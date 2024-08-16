import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWrite {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        try{
            FileReader fr = new FileReader("demo.txt");
            int letter;
            while((letter = fr.read()) != -1){
                sb.append((char)letter);
            }
            System.out.println(sb);
            fr.close();
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
        try(FileWriter fw = new FileWriter("demo2.txt", true)){ // append: true
            fw.write("\n");
            fw.write("Hello, World");
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
