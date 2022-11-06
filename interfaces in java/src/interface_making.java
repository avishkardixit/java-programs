interface bike
{
   public void brek();

   public void speed();

}

class hero implements bike
{
    public void brek()
    {
        System.out.println("applying break.....");
    }
    public void speed()
    {
        System.out.println("increasing speed...");
    }
}



public class interface_making
{
    public static void main(String args[])
    {
        hero r1 = new hero();

        r1.brek();
        r1.speed();


    }


}
