//package voyah.com.demo3;
//
//import jdk.dynalink.beans.StaticClass;
//
//public class me.stephen.demo4.me.stephen.demo5.test009 {
//    public static void main(String[] args) {
////        Person p1 = new me.stephen.demo4.Student("asfs", 123, 23); // upcasting, ok
////        Person p2 = new Person("sfgs", 56);
////        me.stephen.demo4.Student s1 = (me.stephen.demo4.Student) p1; // ok
////        me.stephen.demo4.Student s2 = (me.stephen.demo4.Student) p2; // runtime error! ClassCastException!
//        Person9 p = new Person9();
//        System.out.println(p instanceof Person9); // true
//        System.out.println(p instanceof me.stephen.demo4.Student); // false
//    }
//}
//
//class Person9 {
//    protected String name;
//    protected int age;
//
//    public Person9(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public Person9() {
//
//    }
//}
//
//class me.stephen.demo4.Student extends Person9 {
//    protected int score;
//
//    public me.stephen.demo4.Student(String name, int age, int score) {
//        super(name, age);
//        this.score = score;
//    }
//}
//
//
