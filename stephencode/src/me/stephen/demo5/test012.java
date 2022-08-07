package me.stephen.demo5;

import java.io.*;

public class test012 {
    public static void main(String[] args) throws Exception {

        InputStream is = new FileInputStream("filetest\\kitty.jpg");
        InputStream bis = new BufferedInputStream(is);

        OutputStream op = new FileOutputStream("filetest\\kittycopy.jpg");
        OutputStream bos = new BufferedOutputStream(op);
        //定义一个字节输出流，注意写文件的数据传输顺序

        //缓冲流的方式来进行文件的复制
        byte[] buffer = new byte[1024];
        int len;
        while((len = bis.read(buffer)) != -1) {
            bos.write(buffer, 0, len);
        }
        System.out.println("Copy Done!");
    }
}
