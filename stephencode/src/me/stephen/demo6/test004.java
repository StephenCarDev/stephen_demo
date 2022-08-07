package me.stephen.demo6;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

public class test004 {
    private static Map<String, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        File file1 = new File("C:\\Users\\zhanf\\Documents\\stephen_demo\\resources");
        readfile(file1);
        System.out.println(map);
    }

    public static void readfile(File dir) {
        //传入dir文件对象，和要搜索的文件名name
        if (dir == null) return;
        if (dir.isDirectory()) { //判断dir非空且是一个目录
            File[] f1 = dir.listFiles();     //创建一个文件对象数组f1，来存储dir一级目录下的文件对象
            if (f1 != null && f1.length > 0) {  //确定dir下是否有文件，有文件才往下判断
                for (File file : f1) {  //遍历f1
                    if (file.isFile()) {    //判断f1是否是文件
                        // TODO
                        wordfq(file);
                    } else
                        readfile(file);//如果不是，则递归调用继续查询f1下的各个文件对象
                }
            }
        }
    }

    /**
     * 统计词频
     *
     * @param file
     */
    private static void wordfq(File file) {
        try {
            Reader rs = new FileReader(file);
            char[] temp = new char[1024];
            int len;
            while ((len = rs.read(temp)) != -1) {
                String str1 = new String(temp, 0, len);
                //String指定起始与结束位置
                String str2 = str1.replaceAll(",|\\.", "");
                String[] strs = str2.split(" ");
                for (String s : strs) {
                    if (map.containsKey(s)) {
                        int value = map.get(s);
                        map.put(s, value + 1);
                    } else {
                        map.put(s, 1);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
