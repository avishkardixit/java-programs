import java.io.*;          //import buffer reader functions



public class BufferReader
{
    public static void main(String[] args)throws IOException
    {
        //initialize the bufferdReader class

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter String : ");
        String str = br.readLine();//take a string as inpute from user by buffer reader function

        System.out.println("Enter Integer : ");
        int it = Integer.parseInt(br.readLine());//take integer  inpute from user by buffer reader function



        System.out.println("string is "+str+" and the integer is "+it);



    }
}
