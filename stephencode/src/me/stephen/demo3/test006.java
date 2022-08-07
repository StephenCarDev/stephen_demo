package me.stephen.demo3;

public class test006 {
    public static void main(String[] args) {
        Person6 p = new Person6("Xiao Ming", 15);
        System.out.println(p.getName());
        System.out.println(p.getAge());
    }
}
    class Person6 {
        private String name;
        private int age;

        public Person6(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Person6() {
            
        }

        public String getName() {
            return this.name;
        }

        public int getAge() {
            return this.age;
        }

        public void setName(String name) {
        }

        public void setAge(int age) {
        }
    }

