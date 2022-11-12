


class myThread1 extends Thread
{
    @Override
    public void run() {

        while(true)
        {
            System.out.println("running...");
        }
    }
}


class myThread2 extends Thread
{
    @Override
    public void run() {

        while(true)
        {
            System.out.println("flying...");
        }
    }
}





public class threading_by_extending_thread_class
{
    public static void main(String[] args)
    {
        myThread1 m1 = new myThread1();
        myThread2 m2 = new myThread2();

        m1.start();
        m2.start();

    }
}
