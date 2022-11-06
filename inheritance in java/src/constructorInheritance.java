class base1
{
    int x ;

    base1()
    {
        System.out.println("parent class constructor ");
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

}

class child1 extends base1
{
    int y;


    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    child1()
    {
        System.out.println("these is child class");
    }
}

public class constructorInheritance
{
    public static void main(String args[])
    {
        child1 c =new child1();

    }

}
