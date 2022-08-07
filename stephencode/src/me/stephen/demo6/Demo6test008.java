package me.stephen.demo6;

import java.util.Scanner;

public class Demo6test008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] l = new int[3];
        for (int i = 0; i < l.length; i++) {
            l[i] = sc.nextInt();
        }
        triange(l[0], l[1], l[2]);
    }

    public static void triange(int a, int b, int c) {
        if (a + b <= c || a + c <= b || b + c <= a)
            throw new IllegalArgumentException("a,b,c不能构成三角形");
        else System.out.println("三边长分别为 " +a +" "+b +" " + c);
    }
}
