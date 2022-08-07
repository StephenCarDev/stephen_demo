package me.stephen.demo6;

public class Demo6test005 {
    public static void main(String[] args) {
        System.out.println("程序开始");
        try {
            chu(10, 0);
        } catch (Exception e) {
//            throw new RuntimeException(e);
            System.out.println("出现除0异常，小心");
        }
        System.out.println("程序结束");
        //选中代码，ctrl alt + T  , 选择快捷操作
    }

    private static int chu(int a, int b) {
        return a / b;
    }

}
