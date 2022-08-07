package me.stephen.demo5;

public class test004 {
    //方法递归，注意递归的三要素
    public static void main(String[] args) {
        System.out.println(f(5));
    }

    public static int f(int n) {
        if (n == 1)
            return 1;
        else
            return f(n - 1) + n;
    }
}


