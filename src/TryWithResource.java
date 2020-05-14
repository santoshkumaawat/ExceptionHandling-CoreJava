
import java.io.FileReader;

public class TryWithResource {

    public static void main(String[] args) {
        try (FileReader fr = new FileReader("H:\\mycodes\\java\\Application\\CoreJavaCode\\ExceptionHandling\\src\\File\\Abc.txt")) {
            char ch[] = new char[15];
            fr.read(ch);
            System.out.println(ch);
        } catch (Exception e) {
            System.out.println("Something is happend which is wrong");
        }
    }
}
