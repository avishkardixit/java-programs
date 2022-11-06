//create abstract class pen and inherit founten pen from it
//and write additional method change nib in child founten pen

abstract class pen1
{
    abstract void write();
    abstract void refiel();
}

class fountenPen extends pen
{
    public void write()
    {
        System.out.println("writing....");
    }

    public void change_nib()
    {
        System.out.println("nib changed....");
    }
    public void refiel()
    {
        System.out.println("refiel successfull ...");
    }
}


public class additional_method_in_pen
{
    public static void main(String args[])
    {
        fountenPen b1 = new fountenPen();
        b1.write();
        b1.refiel();
        b1.change_nib();

    }

}
