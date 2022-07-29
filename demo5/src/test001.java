import java.io.File;
import java.io.IOException;

public class test001 {
    public static void main(String[] args) throws IOException {
        File f = new File("D:\\filetest\\Hello.txt");
        f.createNewFile();

    }
}
