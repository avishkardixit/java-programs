//here these program is first finding array index in first try block
// so it will get exception of ArrayIndexOutOfBound in first try block

//and if first try block will get exicuted withoud exception then it will move to second
//try catch block where we take inpute age as a int so if somebody enter other value than int
//like string char then it will trigger catch block

//these is how try catch block exicutes


import java.util.*;

public class nested_try_catch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [] age_array = { 33,32,55,54,55};

        int age;

        try {
            System.out.print("enter which number's person's age you need:");
            int ind = sc.nextInt();
            System.out.println("age of"+ind+"th person is "+age_array[ind]+"years");

            try{
                System.out.println("change the age of that person..");
                System.out.println("new age is :");
                age_array[ind] =sc.nextInt();

            }catch(InputMismatchException e)
            {
                System.out.println("age should be integer value ... try again");
                System.out.println("these is nested catch for invalid age inpute ...");
            }
        }catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("array index is invalid , please enter valid index ");
            System.out.println("these is outer catch block of arrray index...");
        }

    }
}
