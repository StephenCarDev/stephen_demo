import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class test008 {
    public static void main(String[] args) throws Exception {

        InputStream is = new FileInputStream("filetest\\123.txt");
        byte[] by1 = new byte[3];
        int len;    //len接收读取的位数，来控制循环的结束
        while ((len = is.read(by1)) != -1) {    //调用文件输入流is对象的read方法，把字节流取到by1数组里
            //read方法执行完毕之后，文件输入流对象已经写入3个字节到by1，并返回读取的字节数给len

            String str1= new String(by1, 0, len);   //String的一个构造器，来解码字节流，
            // 设置起始和结束位置，就不会把上一轮循环剩余的字节给解码出来了
            System.out.print(str1);
        }


    }
}
