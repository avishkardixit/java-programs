
class expd extends Thread
{
    public expd(String name)
    {
        super(name);
    }

    public void run()
    {
        while(true)
        System.out.println("running...."+getName());
    }
}

public class priority_of_threads
{
    public static void main(String[] args)
    {
        expd e1 = new expd("avishkar dixit");
        expd e2 = new expd("avi");


        e1.setPriority(Thread.MAX_PRIORITY);

        e1.start();
        e2.start();


    }
}
