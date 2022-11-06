


class std
{
    int roll;
    String name;

     public void call()//these is the method we used just to print our values of id and roll
     {
         System.out.println("Roll number is :"+roll);
         System.out.println("Name is "+name);
     }

}







public class myClass
{

    public static void main(String[] args) {

        std avdya = new std(); //here we created object avdya of class std by" new std()";

        avdya.roll=2;
        avdya.name="avishkkar dixit";

        avdya.call();


    }
}
