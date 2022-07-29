package com.voyah.move;

public class move {
    public static void main(String[] args) {
        int n = -536870912;
        int a = n >> 1;  // 11110000 0000000 0000000 00000000 <= -268435456
        int b = n >> 2;  // 10111000 0000000 0000000 00000000 <= -134217728
        int c = n >> 28; // 10000000 0000000 0000000 00000001 <= -2
        int d = n >> 29; // 10000000 0000000 0000000 00000000 <= -1\
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }
}
