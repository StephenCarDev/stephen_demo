package me.stephen.demo5;

import java.io.FileReader;
import java.io.Reader;

public class test010 {
    public static void main(String[] args) throws Exception{

        Reader rs = new FileReader("filetest/234.txt");
        //字符流实验，一次读取一个字符，依次输出
        int code;   //经典IO流的while循环写法
        while((code= rs.read()) !=-1){
            System.out.print((char)code);
        }
    }
}
