package voyah.com.demo3;

public class test003 {
    public static void main(String[] args) {
        Person2 ming = new Person2();
        ming.setBirth(2008);
        System.out.println(ming.getAge());
    }
}

class Person2 {
    private String name;
    private int birth;

    public void setBirth(int birth) {
        this.birth = birth;
    }

    public int getAge() {
        return calcAge(2019); // 调用private方法
    }

    // private方法:
    private int calcAge(int currentYear) {
        return currentYear - this.birth;
    }
}

