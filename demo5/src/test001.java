import java.io.File;
import java.io.IOException;

public class test001 {
    public static void main(String[] args) throws IOException {
        File f = new File("filetest\\Hello.txt");
        f.createNewFile();
        //几乎不用，知道有这么个玩意就行

    }
}
