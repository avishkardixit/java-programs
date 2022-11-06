//create class square and add methosd like setside area perimeter etc.

class square
{
    int side;
    float area;

    float peremeter;

    public int setside(int s)
    {
        side = s;
        return s;
    }

    public float getarea()
    {
        area = side*side;
        return area;
    }

    public float getperimeter()
    {
        peremeter = 4*side;
        return peremeter;
    }

    public void call()
    {
        System.out.println("sides of square are :"+side);
        System.out.println("area of square is :"+area);
        System.out.println("perimeter of square is :"+peremeter);

    }
}



public class square_and_its_oprations
{
    public static void main(String[] args) {

        square s1 = new square();

        s1.setside(6);
        s1.getarea();
        s1.getperimeter();
        s1.call();
    }
}
