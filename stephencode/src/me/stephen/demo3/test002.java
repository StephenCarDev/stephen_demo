package me.stephen.demo3;

import java.util.Scanner;

public class test002 {
    public static void main(String[] args) {
        Person6 ming = new Person6();
        Scanner sc =  new Scanner(System.in);
        String name = sc.next();
        int age = sc.nextInt();
        ming.setName(name); // 设置name
        ming.setAge(age); // 设置age
        System.out.println(ming.getName() + ", " + ming.getAge() + "岁");
    }

}

class Person {
    private String name;
    private int age;

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            throw new IllegalArgumentException("invalid age value");
        }
        this.age = age;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("invalid name");
        }
        this.name = name.strip(); // 去掉首尾空格
    }
}