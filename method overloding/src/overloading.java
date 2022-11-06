public class overloading
{
    //add with two arguments
    int add(int a , int b)
    {

        return a+b;
    }

    //add with three arguments
    int add(int a , int b ,int c)
    {

        return a+b+c;
    }

    //add with four arguments
    int add(int a , int b,int c , int d)
    {

        return a+b+c+d;
    }

    public static void main(String[] args) {
        overloading obj1 = new overloading();

        int twosum = obj1.add(23,45);

        int threesum = obj1.add(34,56,76);

        int foursum = obj1.add(45,67,54,67);

        System.out.println("twosum :"+twosum);
        System.out.println("threesum :"+threesum);
        System.out.println("foursum :"+foursum);

    }
}
