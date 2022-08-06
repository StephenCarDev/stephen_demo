//package voyah.com.demo3;
//
//import jdk.dynalink.beans.StaticClass;
//
//public class test009 {
//    public static void main(String[] args) {
////        Person p1 = new Student("asfs", 123, 23); // upcasting, ok
////        Person p2 = new Person("sfgs", 56);
////        Student s1 = (Student) p1; // ok
////        Student s2 = (Student) p2; // runtime error! ClassCastException!
//        Person9 p = new Person9();
//        System.out.println(p instanceof Person9); // true
//        System.out.println(p instanceof Student); // false
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
//class Student extends Person9 {
//    protected int score;
//
//    public Student(String name, int age, int score) {
//        super(name, age);
//        this.score = score;
//    }
//}
//
//
