import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class test003 {
    public static void main(String[] args) {
        File f1 = new File("filetest");

        File[] file1 = f1.listFiles();
        //列出目标文件夹下的一级文件目录
        for (File file : file1) {
            System.out.println(file);
        }
    }
}
