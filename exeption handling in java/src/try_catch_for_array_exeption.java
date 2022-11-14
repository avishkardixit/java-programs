//here in these program array is of elements 7 if we enter index greater than 7 it will show
//array index exeption to avoid it we have written it in the try catch block  

import java.util.Scanner;

public class try_catch_for_array_exeption
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int [] arr = { 1,34,55,65,34,54,55};

        System.out.print("enter the index of array to show the element :");
        int ind = sc.nextInt();
        System.out.println("element :"+arr[ind]);

        try {
            System.out.println("element :"+arr[ind]);
        }
        catch (Exception e)
        {
            System.out.println("array index is invalid bro...");
        }



    }
}
