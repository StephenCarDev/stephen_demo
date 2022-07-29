import java.util.HashMap;
import java.util.HashSet;

public class test009 {
    public static void main(String[] args) {
        //set系列集合的特点
        HashSet<String> set1 = new HashSet<>();
       //无序不重复，无索引api
        set1.add("tst");
        set1.add("tJaca");
        set1.add("Java");
        set1.add("Java");
        set1.add("Java");
        set1.add("123");
        System.out.println(set1);

    }
}
