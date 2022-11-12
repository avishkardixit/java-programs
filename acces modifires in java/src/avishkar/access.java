
package avishkar;

class a1
{
    private int a = 45; // only use in same class
    public static  char ch = 'z';//use everywere
    protected static float f1 = 5.09f;//use in same packege and subclass only
    static int r = 8;//use in same packege
}

public class access{

    public static void main(String args[])
    {
        a1 a = new a1();
        System.out.println(a1.r);
        System.out.println("hii");
    }

}
