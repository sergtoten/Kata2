import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
    static void main() throws IOException {
        File f = new File("Document.txt");
        System.out.println("File exists: " + f.exists());

        try (Reader fis = new FileReader(f)) {
            String s = fis.readAllAsString();
            System.out.println(s);
        }
    }

}
