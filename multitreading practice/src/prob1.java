



class welc extends Thread
{
    @Override
    public void run() {

        while(true)
        {
            System.out.println("welcome");
        }
    }
}


class gm extends Thread
{
    @Override
    public void run() {

        while(true)
        {
            System.out.println("good morning");
        }
    }
}




public class prob1
{
    public static void main(String[] args)
    {
        welc w1 = new welc();
        w1.start();

        //created sleep method in try and catch block
        try {
            w1.sleep(200);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }


        gm g1 = new gm();
        g1.start();
        g1.setPriority(Thread.MAX_PRIORITY);
        System.out.println("priority of g1 :"+g1.getPriority());
        System.out.println("priority of welc :"+w1.getPriority());


    }
}
