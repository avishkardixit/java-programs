import java.util.ArrayList;

public class arraylist1 {

    public static void main(String args[])
    {
        ArrayList<Integer> a1 = new ArrayList<>();

        a1.add(3);  //.add(element)-->to add element in ArrayList
        a1.add(4);
        a1.add(5);
        a1.add(54);
        a1.add(23);
        a1.add(9);
        a1.add(3,55);

        ArrayList<Integer> b1 = new ArrayList<>();
        b1.add(334);
        b1.add(564);
        b1.add(232);
        b1.add(112);

        a1.addAll(b1); // all elements of second ArrayList gets added to first

        for(int i = 0 ; i < a1.size() ; i++)
        {
            System.out.println(a1.get(i));  //.get()--> to print element
        }

        a1.clear(); // delete all elements
    }
}
