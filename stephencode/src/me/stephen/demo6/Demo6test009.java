package me.stephen.demo6;

import java.util.Scanner;

public class Demo6test009 {
    public static void main(String[] args) throws CustomException {
        Scanner sc = new Scanner(System.in);
        String[] l = new String[5];
        int[] num = new int[5];
        for (int i = 0; i < 5; i++) {
            l[i] = sc.nextLine();

            if (l[i].equals("")) {
                throw CustomException.handleException(new ArrayIndexOutOfBoundsException());
            }
            try {
                num[i] = Integer.parseInt(l[i]);
            } catch (Exception e) {
                throw CustomException.handleException(e);
            }

        }
    }
}
