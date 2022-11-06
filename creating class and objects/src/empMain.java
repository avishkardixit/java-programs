class employee
{
    int salary;
    String name;

    public void getname()
    {
        System.out.println("Name of employee is :"+name);
    }

    public String setname(String n)
    {
        name = n;
        return name;
    }
    public int setsallary(int n)
    {
        salary = n;
        return salary;
    }

    public void getsallary()
    {
        System.out.println("sallary of employee is :"+salary);
    }

    public void call()
    {
        System.out.println("Name of employee is :"+name);
        System.out.println("salary of employee is :"+salary);

    }

}



public class empMain
{
    public static void main(String[] args)
    {
        employee e1 = new employee();

        e1.setname("avishkar dixit");
        e1.setsallary(25000);
        e1.call();


    }
}
