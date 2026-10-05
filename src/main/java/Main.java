import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Main {
    static void main() throws IOException {
        File f = new File("Document.txt");
        System.out.println("File exists: " + f.exists());

        try (FileInputStream fis = new FileInputStream(f)) {
            byte[] bytes = fis.readAllBytes();
            System.out.println(new String(bytes));
        }
    }

}
