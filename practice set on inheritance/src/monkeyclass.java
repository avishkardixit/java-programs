//create class monkey and then inherit humen from it with function jump and bite
//create class human which extend these class monkey and impliments interface basic animal to impliment
// methods like eat walk sleep

abstract class monkey
{
    abstract void jump();

    public void bite()
    {
        System.out.println("biting...");
    }

}
interface basicAnimal
{
    void run();
    void eat();
    void sleep();

}
class humans extends monkey implements basicAnimal
{
    public void jump()
    {
        System.out.println("human is jumping...");
    }
    public void run()
    {
        System.out.println("running...");
    }
    public void eat()
    {
        System.out.println("eating...");
    }
    public void sleep()
    {
        System.out.println("sleeping ...");
    }
}




public class monkeyclass
{
    public static void main(String args[])
    {
           humans h1 = new humans();
           h1.eat();
           h1.run();
           h1.jump();
           h1.bite();
           h1.sleep();
    }
}
