// create a class of moves for a game and print hitting , runnning and etc by by methods
class moves
{
    public void run()
    {
        System.out.println("running ......");
    }
    public void hit()
    {
        System.out.println("hitting very hard .....!!");
    }
    public void jump()
    {
        System.out.println("jumping ......");
    }
    public void fire()
    {
        System.out.println("fired ...!!");
    }
}



public class rakshas_game
{
    public static void main(String[] args)
    {
        moves  raone = new moves();
        raone.run();
        raone.hit();
        raone.jump();
        raone.fire();

    }
}
