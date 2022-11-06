
class base
{
    int num;

    public void setNum(int n)
    {
        num = n;
    }

    public int getNum()
    {
        return num;
    }
}

class child extends base
{
    int cnum;


    public void setcnum(int n)
    {
        cnum = n;
    }

    public int getcnum()
    {
        return cnum;
    }
}




public class MainClass
{
    public static void main(String[] args) {
             child c1 = new child();
             c1.setnum(34); //these method is of parent class but we can call
                                     // it by object of child class these is inheritance
           System.out.println("num is parent is :"+c1.getNum());
    }
}
