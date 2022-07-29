import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class test003 {
    public static void main(String[] args) {
        File f1 = new File("D:\\filetest");

        File[] file1 = f1.listFiles();
        for (File file : file1) {
            System.out.println(file);
        }


    }
}
