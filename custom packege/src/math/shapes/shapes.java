
package math.shapes;


class square
{
    int side;

    int area;

    public void set_for_square(int side)
    {
        this.side = side;
    }

    public void square_Area()
    {
        System.out.println("area of square :"+side*side);
    }


}

class cube extends square
{
    int volume;

    public void cube_volume()
    {
        volume = side*side*side;
        System.out.println("volume of the cube : "+volume);
    }
}

class rectangle extends cube
{
    int l;

    int b;

    int area;

    public void set_for_rectangle(int l,int b)
    {
        this.l= l;
        this.b=b;
    }

    public void rect_Area()
    {
        area = l*b;
        System.out.println("area of rectangle :"+area);
    }


}

class cuboid extends rectangle
{
    int h;

    int volume;

    public void  set_for_cuboid(int l,int b ,int h)
    {
        this.l=l;
        this.b=b;
        this.h=h;
    }

    public void cuboid_volume()
    {
        volume =l*b*h;
        System.out.println("area of cuboid :"+volume);
    }
}





public class shapes extends  cuboid{

    public void hello()
    {
        System.out.println("hello ji");

    }

    public static void main(String args[])
    {

        System.out.println("these is shapes package");
        cuboid c1 = new cuboid();
        c1.set_for_rectangle(43,54);
        c1.rect_Area();
    }
}
