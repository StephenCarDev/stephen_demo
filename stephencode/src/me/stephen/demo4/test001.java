package me.stephen.demo4;

import java.util.ArrayList;
import java.util.Scanner;

public class test001 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            int a1 = sc.nextInt();
            list.add(a1);
        }

        list.removeIf(integer -> integer < 80);

        System.out.println(list);
    }
}
