package me.stephen.demo3;

public class test013 {
    public static void main(String[] args) {
        Person13 ming = new Person13("Xiao Ming", 12);
        Person13 hong = new Person13("Xiao Hong", 15);
        ming.number = 88;
        System.out.println(hong.number);
        hong.number = 99;
        System.out.println(ming.number);
    }
}


class Person13 {
    public String name;
    public int age;

    public static int number;

    public Person13(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
