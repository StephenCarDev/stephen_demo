import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class test006 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str1  = "test测试";
        byte[] by1 = str1.getBytes("GBK");
        System.out.println(by1.length);
        System.out.println(Arrays.toString(by1));

        String str2 = new String(by1,"GBK");
        System.out.println(str2);

    }
}
