

class cylender
{
    float radius;
    float height;

    public void setval(int r , int h)
    {
        radius = r;

        height = h;

    }

    public double surf_area()
    {
        return (2*3.14*radius*height)+(2*3.14)*(radius*radius);
    }


}




public class myMainClass
{
    public static void main(String[] args)
    {
        cylender s1 = new cylender();

        s1.setval(3,5);

        System.out.println("radis :"+s1.radius+"\nheight :"+s1.height);

        System.out.println("surface area of s1 is "+s1.surf_area());

    }
}
