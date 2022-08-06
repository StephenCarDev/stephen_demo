package com.voyah.variable;

public class variable2 {
    public static void main(String[] args) {
        double a = 8.9;

        //变量的有限范围到“}”截止，大括号外面不可访问
        {
            int b = 8;
            System.out.println(b);

        }
        //System.out.println(b);

        System.out.println(a);
    }
}
