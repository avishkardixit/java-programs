import java.util.*;

class rectangle
{
    double length;
    double width ;

    public void set_l_w(double l , double w)
    {
        length = l;
        width = w;
    }

    public double rect_area()
    {
        return length*width;
    }

}

class cuboid extends rectangle
{
    double hight;



    public void set_h(double hh)
    {
        hight =hh;
    }

    public double cube_area()
    {
        return  length*width*hight;
    }
}





public class rectangle_and_cuboid
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double l,w,h;

        System.out.println("length");
        l = sc.nextDouble();
        System.out.println("width");
        w = sc.nextDouble();
        System.out.println("height");
        h = sc.nextDouble();




        cuboid q1  = new cuboid();

         q1.set_l_w(l,w);
         q1.set_h(h);

        System.out.println("area of rectangle :"+q1.rect_area());
        System.out.println("area of cuboid :"+q1.cube_area());

    }
}
