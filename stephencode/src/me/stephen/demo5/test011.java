package me.stephen.demo5;

import java.io.FileReader;
import java.io.Reader;

public class test011 {
    public static void main(String[] args) throws Exception {

        Reader rs = new FileReader("filetest/234.txt");
        char[] buffer = new char[1024];
        //依次读取1024个字符
        int len;
        while ((len = rs.read(buffer)) != -1) {
            String str1 = new String(buffer, 0, len);
            //String指定起始与结束位置
            System.out.print(str1);
        }

    }
}
