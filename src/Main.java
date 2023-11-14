
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {
        try(FileInputStream in = new FileInputStream("C:\\Users\\alaah\\IdeaProjects\\exp\\src\\input.txt");
            FileOutputStream out = new FileOutputStream("C:\\Users\\alaah\\IdeaProjects\\exp\\src\\output.txt"))
        {
            byte[] buffer = new byte[in.available()];
            in.read(buffer, 0, buffer.length);
            out.write(buffer, 0, buffer.length);
        } catch(FileNotFoundException ex) {
            System.out.println("One of files does not exist or you do not have permissions to I/O");
            System.out.println(ex.getMessage());
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
