import java.util.*;

class MyException extends Exception
{
    @Override
    public String getMessage()
    {

        return "these is custom Exception message by getMessage";
       // return super.getMessage() ;         // these will return what exeption
                                               // message is stored at parent
                                               //class Exception
    }

    @Override
    public String toString()
    {

        return "These is Original Exeption Of by toString";
       // return super.toString() ;          //these super.tostring returns the message in
                                              //parent / superclass in to string method
    }

    @Override
    public void printStackTrace() {


        super.printStackTrace();         //these will write actual location of exception
                                         //the foult in the exception and all details
                                         //stored at superclass
    }
}



public class create_custom_exception
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter ahe of adult:");
        int age = sc.nextInt();
        if(age < 18 )
        try
        {
             throw new MyException();
        }catch(Exception e )
        {
            System.out.println(e);//it will run toString

            System.out.println(e.getMessage());

            e.printStackTrace();//print the actuall foult/error exception , location and all stuff
        }
    }
}
