//here we are taking inpute age as integer when user will enter the value
//like char or float or string it will shows the invalid argument exeption
//to avoid these we will write try catch block

import java.util.Scanner;


public class try_catch_for_invalid_argument
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int age;
        try {
            System.out.println("enter the age :");
            age = sc.nextInt();
            System.out.println("age :"+age);
        }
        catch(Exception e)
        {
            System.out.println("age is always an INTEGER ... ");
            System.out.println("please enter age in integer format");
        }


    }
}
