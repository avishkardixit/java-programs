
//here in these program we have created an abstract class mobile and inherited
// two subclasses from it i.e. vivo and apple and all the abstract methos wich are created in
// mobile class are compalsarily overrided in subclasses vivo and samsung

//we have created hello method in mobile class which is not abstract and hence it is *NOT compalsary
// to override hello in subclasses .





abstract class mobile
{
    public void hello()
    {
        System.out.println("HABIBI , hm abstract class hoti...");
    }

    abstract public  void name();
    abstract public void ram_rom();
    abstract public void model_number();

}
class vivo extends mobile
{
    @Override
    public void name()
    {
        System.out.println("vivo s1 .....");
    }

    public void ram_rom()
    {
        System.out.println("4 gb ram 128 gb rom ......");
    }

    public void model_number()
    {
        System.out.println("IME0443Q61242");
    }
}

class apple extends mobile
{
    @Override
    public void name()
    {
        System.out.println("Iphone 14 pro max .....");
    }

    public void ram_rom()
    {
        System.out.println("4 gb ram 256 gb rom ......");
    }

    public void model_number()
    {
        System.out.println("IOS6643scv1");
    }
}





public class mobile_vala_program
{
    public static void main(String args[])
    {
           vivo v1 = new vivo();
           v1.name();
           v1.ram_rom();
           v1.model_number();

           apple a1 = new apple();
           a1.name();
           a1.ram_rom();
           a1.model_number();


    }
}
