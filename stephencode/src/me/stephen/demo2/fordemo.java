package me.stephen.demo2;

public class fordemo {
    public static void main(String[] args) {

        int summ = 0;
        int a, b, c;

        for (int i = 100; i < 1000; i++) {
            a = i / 100;
            b = i / 10 % 10;
            c = i % 10;

            if (a * a * a + b * b * b + c * c * c == i) {
                System.out.print(i + "\t");
                summ++;
            }

        }
        System.out.println("");
        System.out.println("水仙花总数为" + summ);

    }
}
