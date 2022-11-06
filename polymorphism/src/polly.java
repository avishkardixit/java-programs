
abstract class phone
{
    abstract public void start();
}
interface gps
{
    void location();
}
interface camera
{
    void clickPick();
}

interface musicPlayer
{
    void play();

}

class smarphone extends phone implements gps,camera,musicPlayer
{
    public void start()
    {
        System.out.println("starting your device ......");
    }

    public void location()
    {
        System.out.println("finding your location .....");
    }
    public void clickPick()
    {
        System.out.println("Smile , we are clicking picture ...");
    }
    public void play()
    {
        System.out.println("playing music .....");
    }

}





public class polly
{
    public static void main(String args[])
    {
        //here these m1 is object of smartphone class but it is in refrence of musicplayer
        //interface so it can only use methods from  musciplayer interface
         musicPlayer m1 = new smarphone();
         m1.play();

         //similarly f1 can only use methods from phone class
         phone f1 = new smarphone();
         f1.start();
    }
}
