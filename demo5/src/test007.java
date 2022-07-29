import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class test007 {
    public static void main(String[] args) throws Exception {

        InputStream is = new FileInputStream("D:\\stephen_demo\\demo5\\123.txt");
        //建立管道，使磁盘与内存联通

        //读取一个字节并返回
//        int b1 = is.read();
//        System.out.println((char)b1);
        //输出效率低

        //一滴一滴地读取，速度慢，且不可以读取中文
//        int b;
//        while ((b = is.read()) != -1){
//            System.out.println((char)b);
//        }

        byte[] by1 = new byte[3];
        int len = is.read(by1);
        System.out.println("读取了" + len);
        String rs = new String(by1);
        System.out.println(rs);


    }
}
