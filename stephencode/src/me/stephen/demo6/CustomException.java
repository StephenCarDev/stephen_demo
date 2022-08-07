package me.stephen.demo6;

/**
 * Description:自定义异常类<p>
 * Created by Stephen on 2022/8/7 14:44.
 */
public class CustomException extends Exception {

    public CustomException(String message) {
        super(message);
    }

    public static CustomException handleException(Throwable e) {
        if (e instanceof NullPointerException) {
            return new CustomException("空指针了！");
        } else if (e instanceof ArithmeticException) {
            return new CustomException("除数不可为0！");
        }
        // 在此补充其他
        else if (e instanceof NumberFormatException) {
            return new CustomException("请输入整数");
        } else if (e instanceof ArrayIndexOutOfBoundsException) {
            return new CustomException("请输入至少5个整数");
        } else {
            return new CustomException("异常了");
        }
    }
}