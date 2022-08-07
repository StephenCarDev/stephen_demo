package me.stephen.demo2;

import java.util.Scanner;

public class whiledemo {
    public static void main(String[] args) {
     /*   double hight= 0.1;
        int summ = 0;
        while(hight < 8848860){
            hight *= 2;
            summ++;

        }
        System.out.println("折叠"+summ+"次");*/

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入密码:");
        while (true) {
            String pw = sc.next();

            if (pw.equals("abc123"))
                break;

            System.out.println("密码错误，请重试");
        }
        System.out.println("密码正确，欢迎使用");

    }
}
