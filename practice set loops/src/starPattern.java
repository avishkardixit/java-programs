public class starPattern {

    public static void main(String args[])
    {

        for(int i = 4 ; i>=1 ; i--)
        {
            //these second loop will execute i times for evry time
            for(int j = 0 ; j <i ;j++)
            {
                System.out.print("*");
            }

            System.out.print("\n");
        }
    }
}
