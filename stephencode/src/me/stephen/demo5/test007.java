package me.stephen.demo5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class test007 {
    public static void main(String[] args) throws Exception {

        InputStream is = new FileInputStream("filetest\\123.txt");
        //建立管道，使磁盘与内存联通

        byte[] by1 = new byte[3];
        int len = is.read(by1);
        //输入流对象的read方法，将文件对象的输入流读取字节到字节数组里去

        System.out.println("本次读取了" + len + "个字节");
        String rs = new String(by1);
        System.out.println(rs);


    }
}
