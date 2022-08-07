package me.stephen.demo5;

import java.io.File;

public class test005 {
    public static void main(String[] args) {
        File test = new File("D:/");
        searchfile(test, "AppxReparse.exe");
    }

    //写一个递归方法来实现，文件搜索的操作
    public static void searchfile(File dir, String name) {
        //传入dir文件对象，和要搜索的文件名name
        if (dir != null && dir.isDirectory()) { //判断dir非空且是一个目录
            File[] f1 = dir.listFiles();     //创建一个文件对象数组f1，来存储dir一级目录下的文件对象
            if (f1 != null && f1.length > 0) {  //确定dir下是否有文件，有文件才往下判断
                for (File file : f1) {  //遍历f1
                    if (file.isFile()) {    //判断f1是否是文件
                        if (file.getName().contains(name))  //模糊查找，看f1文件名是否包含目标名字name
                            System.out.println("找到了：" + file.getAbsolutePath());
                    } else
                        searchfile(file, name);//如果不是，则递归调用继续查询f1下的各个文件对象
                }
            }
        } else  //若dir为空或者不是文件夹
            System.out.println("错误，输入的不是文件夹！");
    }
}
