// create a abstract class pen with methods write() and refiel()

abstract class pen
{
    abstract void write();
    abstract void refiel();
}

class ballPen extends pen
{
    public void write()
    {
        System.out.println("writing....");
    }


     public void refiel()
     {
         System.out.println("refiel successfull ...");
     }
}


public class creating_pen
{
    public static void main(String args[])
    {
        ballPen b1 = new ballPen();
        b1.write();
        b1.refiel();

    }

}
