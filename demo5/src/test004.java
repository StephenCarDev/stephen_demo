public class test004 {
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


