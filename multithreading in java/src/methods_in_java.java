
class ex extends Thread
{

    public void run()
    {
        int i=1;
        while(i < 500) {
            System.out.println("running....");
            i++;
        }
    }
}
class ez extends Thread
{

    public void run()
    {
        int i=1;
        while(i < 500) {
            System.out.println("RUNNING....");
            i++;
        }
    }
}



public class methods_in_java {
    public static void main(String[] args)
    {
        ex e1 = new ex();
        e1.start();

        //write join method in try and catch because it throws exeption
        try {
            e1.join();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

        ez e2 = new ez();
        e2.start();

    }
}
