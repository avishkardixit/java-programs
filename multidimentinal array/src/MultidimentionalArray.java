public class MultidimentionalArray
{
    public static void main(String args[])
    {
        int [][] arr ;
         arr = new int[2][3];

        arr [0][0] = 24;
        arr [0][1] = 27;
        arr [0][2] = 29;
        arr [1][0] = 20;
        arr [1][1] = 28;
        arr [1][2] = 25;

        for(int i = 0 ; i<2 ; i++)
        {
            for(int j = 0 ; j <3 ;j++)
            {
                System.out.println(arr[i][j]);
            }
            System.out.print("\n");
        }



    }
}
