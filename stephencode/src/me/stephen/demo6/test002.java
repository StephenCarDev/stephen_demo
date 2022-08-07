package me.stephen.demo6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//Steam流的使用
public class test002 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        Collections.addAll(names, "刘清晨", "张无忌", "周芷若", "张良", "张学良", "我日");

        names.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(s -> System.out.println(s));

    }
}
