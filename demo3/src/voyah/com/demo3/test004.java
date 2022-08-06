package voyah.com.demo3;

public class test004 {
    public static void main(String[] args) {
        Group g = new Group();
        g.setNames("Xiao Ming", "Xiao Hong", "Xiao Jun"); // 传入3个String
        String[] test = g.getnames();
        for (String n : test) {
            System.out.println(n);
        }
    }
}

class Group {
    private String[] names;

    public void setNames(String... names) {
        this.names = names;
    }

    public String[] getnames() {
        return this.names;
    }
}