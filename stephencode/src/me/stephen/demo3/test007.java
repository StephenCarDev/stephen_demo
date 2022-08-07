package me.stephen.demo3;

public class test007 {
    public static void main(String[] args) {
        Person7 p1 = new Person7("Stephen", 23);
        System.out.println(p1.name + ',' + p1.age + '岁');
    }
}
    class Person7{
        final String name;
        int age;

        public Person7(String name, int age){
            this.name = name;
            this.age = age;
        }

        public Person7(String name){
            this(name, 18);
        }

        public Person7(){
            this("Unnamed");
        }
    }

