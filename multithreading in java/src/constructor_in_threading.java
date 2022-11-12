
class exp extends Thread
{
    public exp(String name)
    {
        super(name);
    }

    public void run()
    {
        System.out.println("running....");
    }
}



public class constructor_in_threading
{
    public static void main(String[] args)
    {
        exp e1 = new exp("avishkar");
        System.out.println("name :"+e1.getName());
        System.out.println("id :"+e1.getId());
        System.out.println("priority :"+e1.getPriority());




    }

}
