import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class test006 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str1  = "test测试";
        byte[] by1 = str1.getBytes("GBK");
        //获取以指定字符编码集进行编码的字符串的字节流，注意定语

        System.out.println(by1.length);
        System.out.println(Arrays.toString(by1));
        //String的一个构造器，直接根据字节流来编码出字符串，可指定字符集
        String str2 = new String(by1,"GBK");
        System.out.println(str2);

    }
}
