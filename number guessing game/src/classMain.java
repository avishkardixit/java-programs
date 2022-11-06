//creating a number guessing game


import java.util.*;


class game
{
    //initiated 3 variables for stroing user input , computer input and count of attempts
    int num;
    int rnd;

    int count =1;

    public int user() // created a method to get user inpute
    {
        System.out.print("number :");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        return num;
    }

    public int rnd_num()//created method to create random number
    {
        int max = 100;
        int min = 1;
        double randomint =  Math.random()*(max-min+1)+min;
        rnd = (int)randomint;
        return rnd;
    }

    public void match()//in these emthod we will check user number and computer numbers are
    {                   //matchin or not


        if (num == rnd)//if numbers are matched then returning the result
        {
            System.out.println("congratulations you found the number in "+count+ " attempts");

        }
        else if(num <rnd )//if number is smaller
        {

            System.out.println("please enter  greater  number :");
            count = count+1;
            //these two methods are recalled to get greater  number and match it again
            user();
            match();

        }
        else//when user number is greater
        {

            System.out.println("please enter smaller number :");
            count = count+1;
            //these two methods are recalled to get smaller  number and match it again
            user();
            match();
        }

    }
}



public class classMain {
    public static void main(String[] args) {

      game obj1 = new game();//created object "obj1" of the class "game" by new game();


      //called three methods of game
      obj1.rnd_num();
      obj1.user();
      obj1.match();


    }
}
