//异常处理，不可变集合

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class test001 {
    public static void main(String[] args) {
        List<Double> list1 = List.of(123.3, 564.7, 345.7, 56.2);
        //list1.add(123.3);
        //list1.set(2, 34.2);
        System.out.println(list1);

        Set<String> set1 = Set.of("test", "JAVA", "Python");
        //set1.add("sdf");
        System.out.println(set1);

        Map<String, Integer> map1 = Map.of("Huawei", 5999, "Macbook", 8999, "Xiaomi", 5299);
        //map1.put("Dell", 4599);
        System.out.println(map1);

    }
}
