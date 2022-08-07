package com.voyah.unicode1;

public class unicode1 {
    public static void main(String[] args) {
        int a = 72;
        int b = 105;
        int c = 65281;
        // FIXME:存在空字符串，使后面的abc自动转换成字符串相加
        String s = "" + (char)a + (char)b + (char)c;
        System.out.println(s);
    }
}
