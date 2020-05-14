
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsKeyword {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader fr = new FileReader("xyz");
        fr.read();
    }
}
