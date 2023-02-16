import java.util.LinkedList;

public class linkedList {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(3);
        l1.add(4);
        l1.add(7);
        l1.add(9);
        l1.addLast(556);
        l1.addFirst(34);

        for(int i = 0 ; i < l1.size() ; i++)
        {
            System.out.println(l1.get(i));
        }

    }
}
