

//here class smartphone is abstracted from class phone and implimented using interfaces
// gps , camera and music player




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





public class interface_and_inheritance
{
    public static void main(String args[])
    {

    }
}
