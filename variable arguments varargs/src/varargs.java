public class varargs
{
    static int sum(int ...sumarray)           //here all int arguments passed to sum are converted
    {                                         //in array by var arg function


        int result =0;

        for(int i = 0;i<sumarray.length;i++)
        {
            result = result+sumarray[i];
        }
        return result;
    }


    public static void main(String args[])
    {
        int a =sum(2,3);
        int b =sum(4,5,67,54,34,66);
        int c =sum(34);
        System.out.println("2+3 ="+a);
        System.out.println("4+5+67+54+34+66 ="+b);
        System.out.println("34 ="+c);
    }



}
