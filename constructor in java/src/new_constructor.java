
class std
{
    int roll;
    String name;


    public std(String n , int i)
    {
        roll = i;
        name = n;

    }

}





public class new_constructor
{
    public static void main(String[] args)
    {
        std s1 = new std("avdya",71);

        System.out.println(s1.name+s1.roll);
    }

}
