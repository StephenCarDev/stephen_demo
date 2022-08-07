package me.stephen.demo4;

import java.util.LinkedList;
//栈和队列的练习，保证出入的逻辑正确即可。
public class test007 {
    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>();
        queue.addLast("Java1");
        queue.addLast("Java2");
        queue.addLast("Java3");
        System.out.println(queue);

        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue);

        LinkedList<String> stack = new LinkedList<>();

        stack.push("test");
        stack.push("test2");
        stack.push("test3");
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(stack);

    }
}
