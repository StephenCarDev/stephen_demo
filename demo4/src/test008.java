import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class test008 {
    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        list1.add("Zhanfeng");
        list1.add("Java");
        list1.add("Java");
        list1.add("Java3");
        list1.add("Java3");

        //  调用iterator方法，使it占第一号位置
        Iterator<String> it = list1.iterator();

        while (it.hasNext()) {
            //从0开始往后移动，it.hasNext()判断it标尺是否还有值
            String ele = it.next(); //先取元素再后移一位
            if("Java".equals(ele)){
                it.remove();
                //用it来操作，删除当前Java，而不是用listremove来删除
                //会继续在原位置判断，不会后移致使漏删
            }
        }
        System.out.println(list1);
//        增强型for循环，内部原理就是简易的iterator遍历器
//        for (String ele : list1) {
//            System.out.println(ele);
//        }
        //foreach不能边遍历边删除，会出并发修改异常
        //也无法解决，拿不到迭代器
        //只能用来遍历数据，查询
    }
}
