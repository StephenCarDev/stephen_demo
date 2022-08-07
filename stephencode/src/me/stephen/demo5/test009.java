package me.stephen.demo5;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class test009 {
    public static void main(String[] args) throws Exception {

        //一次性读取完全部字节，小文件适用
        File f = new File("filetest\\234.txt");
        InputStream is = new FileInputStream(f);
        byte[] br1 = is.readAllBytes();
        //读取文件所有字节到数组里去，复制图片样例
        /*
        InputStream is= new FileInputStream("kitty.jpg");
        byte[] br1 = is.readAllBytes();
        OutputStream op = new FileOutputStream("kittycopy.jpg");
        op.write(br1);
        op.close();

        * */
        String str1 = new String(br1);
        System.out.println(str1);


    }
}
