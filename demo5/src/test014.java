import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 目标：学会对象序列化，使用 ObjectOutputStream 把内存中的对象存入到磁盘文件中。
 * <p>
 * transient修饰的成员变量不参与序列化了
 * 对象如果要序列化，必须实现Serializable序列化接口。

 * 申明序列化的版本号码
 * 序列化的版本号与反序列化的版本号必须一致才不会出错！
 * private static final long serialVersionUID = 1;
 */

public class test014 {
    public static void main(String[] args) throws Exception {
        // 1、创建学生对象
        Student s = new Student("陈磊", "chenlei", "1314520", 21);

        // 2、对象序列化：使用对象字节输出流包装字节输出流管道
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("filetest/obj.txt"));

        // 3、直接调用序列化方法
        oos.writeObject(s);

        // 4、释放资源
        oos.close();
        System.out.println("序列化完成了~~");
    }
}

class Student implements Serializable {
    // 申明序列化的版本号码
    // 序列化的版本号与反序列化的版本号必须一致才不会出错！
    private static final long serialVersionUID = 1;
    private String name;
    private String loginName;
    // transient修饰的成员变量不参与序列化了
    private transient String passWord;
    private int age;

    public Student() {
    }

    public Student(String name, String loginName, String passWord, int age) {
        this.name = name;
        this.loginName = loginName;
        this.passWord = passWord;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", loginName='" + loginName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", age=" + age +
                '}';
    }
}
