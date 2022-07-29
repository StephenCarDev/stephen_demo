import java.util.Random;

public class randomdemo {
    public static void main(String[] args) {
        Random rs = new Random();
        int i = 0;
        while(i<10){
            int number = rs.nextInt(100);
            System.out.println(number);
            i++;
        }

    }
}
