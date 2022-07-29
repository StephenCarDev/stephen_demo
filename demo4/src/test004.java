import java.util.Iterator;
import java.util.List;

public class test004 {
    public static void main(String[] args) {

        List<String> list = List.of("apple", "pear", "banana");
        for (Iterator<String> it = list.iterator(); it.hasNext(); ) {
            String s = it.next();
            System.out.println(s);
        }
    }
}
