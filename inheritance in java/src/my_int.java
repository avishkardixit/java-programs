//circle and cylender by inheritance


import java.util.*;


class circle
{
   double radius ;


   double area_of_circle;

   public void set_red(double red)
   {
        radius = red;
   }
   public  double area_of_circel()
   {
       area_of_circle=3.17*radius*radius;
       return area_of_circle;
   }

}
class cylender extends circle
{
    double  area_of_cylender ;

    double hight;

    public void setHight(double h)
    {
        hight = h;
    }

    public  double area_of_cylender()
    {
        area_of_cylender = hight * area_of_circle;
        return area_of_cylender;

    }


}




public class my_int
{
    public static void main(String[] args)
    {
        double r ;
        double h;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter radius :");
        r =sc.nextDouble();
        System.out.print("enter hight :");
        h =sc.nextDouble();


        cylender c1 = new cylender();
        c1.set_red(r);
        c1.setHight(h);
        System.out.println("area of circle is "+c1.area_of_circel());
        System.out.println("area of circle is "+c1.area_of_cylender());
    }
}
