package me.stephen.demo6;

public class Demo6test007 {
    public static void main(String[] args) throws CustomException {
        makenullpointer("s1 is not null");
        makenullpointer(null);
        //System.out.println(makearithmeticproblem(1, 2));
        //System.out.println(makearithmeticproblem(1, 0));

        //轮流三行语句注释来测试
    }

    public static void makenullpointer(String s1) throws CustomException {
        if (s1 == null) {
            throw CustomException.handleException(new NullPointerException());
        } else System.out.println(s1);
    }

    public static int makearithmeticproblem(int a, int b) throws CustomException {
        if (b == 0) {
            throw CustomException.handleException(new ArithmeticException());
        } else return a / b;
    }

}
