import java.util.HashSet;

public class hashset {

    public static void main(String[] args) {
        HashSet<Integer> m1 = new HashSet<>();
        m1.add(43);
        m1.add(45);
        m1.add(45);
        m1.add(43);
        m1.add(4);
        System.out.println(m1);
        //it will take argument in order withaut repeatation
    }
}
