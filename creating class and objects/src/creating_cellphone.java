//create class cellphone to print ringing vibrating etc

class cellphone
{
   public void ring()
   {
       System.out.println("Ringging.....");
   }
   public void vibrate()
   {
       System.out.println("Vibrating.....");
   }
   public void silent()
   {
       System.out.println("Sillent.....");
   }
}

public class creating_cellphone
{
    public static void main(String[] args)
    {
        cellphone s1 = new cellphone();

        s1.ring();

        s1.silent();

        s1.vibrate();

    }
}
