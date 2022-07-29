import java.util.Scanner;

public class switchdemo {
    public static void main(String[] args) {
        int test = 1;
        switch (test) {
            case 1:
                System.out.println("hello");
                break;
            case 2:
                System.out.println("world");
                break;
            default:
                System.out.println("error");
                break;
        }
        System.out.println("end");
    }
}
