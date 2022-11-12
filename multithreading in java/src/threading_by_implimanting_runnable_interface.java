

class threading1 implements Runnable
{
    @Override
    public void run()
    {
        while(true)
        {
            System.out.println("running...");
        }
    }
}

class threading2 implements Runnable
{
    @Override
    public void run()
    {
        while(true)
        {
            System.out.println("RUNNING....");
        }
    }
}




public class threading_by_implimanting_runnable_interface
{
    public static void main(String[] args)
    {
        threading1 t1 = new threading1();
        Thread thr1 = new Thread(t1);

        threading2 t2 = new threading2();
        Thread thr2 = new Thread(t2);

        thr1.start();
        thr2.start();
    }
}
