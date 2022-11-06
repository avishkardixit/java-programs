
//these program will shows you the how method ovverriding works exactly

//when we call same method of parent class in child class then it will get overrided
//and when we call that method by parent class it will show output from parent class
// and when we will call method by child class it will show output from child class

class a
{
    public void firstmeth()
    {
        System.out.println("mera nam class a he ");
    }

}

class b extends a
{
    public void firstmeth()
    {
        System.out.println("mera nam class b he");
    }
}





public class overriding
{
    public static void main(String[] args)
    {
        System.out.println("these is method from class a");
        a obj = new a();
        obj.firstmeth();

        System.out.println("these is method from class b");
        b obj1 = new b();
        obj1.firstmeth();

    }
}
