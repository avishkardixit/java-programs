//interface opration  methods area , vol
//define const pi  3.142
//create class cylander which impliments having memb radius and higth
//create one obj calc its area and vol

interface operation
{
    double pie = 3.142;
    double area();
    double  vol();
}

class cylender implements operation
{
    double c_radius;
    double c_height;

    void cylender(double r ,double h)
    {
        c_radius = r;
        c_height = h;
    }

    public double area()
    {
        return (2*pie*c_radius*c_height)+ (2*(pie*(c_radius*c_radius)));


    }

    public double vol()
    {
          return pie*(c_radius*c_radius)*c_height;
    }
}





public class interfacin_in_java {

    public static void main(String args[])
    {
          cylender c1 = new cylender();
          c1.cylender(4,5);

        System.out.println("area :"+c1.area());

        System.out.println("vol :"+c1.vol());
    }

}
