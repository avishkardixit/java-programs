public class repeat_4_using_recuursion
{
    static int rep(int n)
    {
        return rep(n);
    }
    public static void main(String args[])
    {
        int a = rep(4);
        System.out.println(a);
    }
}
