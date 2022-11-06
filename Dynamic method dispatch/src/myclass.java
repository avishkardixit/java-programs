//here we will learn Dynamic dispatch

//it is r=the proprty by which we can give refernce of parent class and create object of child class

//lets see how
class phone
{
    public void name()
    {
        System.out.println("these is phone ");
    }
}
class smartphone extends phone
{
    public void name()
    {
        System.out.println("these is smartphone ");
    }
}


public class myclass
{
    public static void main(String[] args)
    {
        phone f1 = new smartphone();

        f1.name();

    }
}
