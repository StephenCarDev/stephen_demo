import java.io.*;

public class test013 {
    public static void main(String[] args) throws Exception {
        //转换流实验
        //提取文件原始字节流
        InputStream is = new FileInputStream("filetest\\234.txt");
        //字节流转换成字符输入流, 默认都是utf-8编码，把234.txt的编码改成GBK来实验

        Reader isr = new InputStreamReader(is,"GBK");
        //在这个转换流的第二个参数里填入字符集，就可以以指定编码格式来转换字符流
        BufferedReader br = new BufferedReader(isr);

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
            /*
            * ���ı�������ԣ�Ӣ�HyperText Mar
            * 已经乱码
            * */
        }


    }
}
