//here we have created 2 catch blocks

//when we give wron inpute like string , float , char then InputMismatchException block will
//exicuted

//and when we give index greater than the array size then ArrayIndexOutOfBoundsException
//will get exicuted 

import java.util.*;

public class multiple_catch_block_for_handeling_specific_exception
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = { 1,34,55,65,34,54,55};

        System.out.print("enter the index of array to show the element :");
        int ind = sc.nextInt();
        System.out.println("element :"+arr[ind]);

        try {
            System.out.println("element :"+arr[ind]);
        }
        catch (ArrayIndexOutOfBoundsException er)
        {
            System.out.println("array index is invalid bro...");
            System.out.println(er);
        }
        catch (InputMismatchException epr)
        {
            System.out.println("invalid inpute ....");
            System.out.println(epr);
        }
    }
}
