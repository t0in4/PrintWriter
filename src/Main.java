import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
       File file = new File("C:\\Users\\user\\file.txt");
       try (PrintWriter printWriter = new PrintWriter(file)) {
           printWriter.print("Hello");
           printWriter.println("Java");
           printWriter.println(123);
           printWriter.printf("You have %d %s %.3f", 400, "gold coins", 12.86678928);
       } catch(IOException e) {
           System.out.println(e.getCause());
       }
    }
}