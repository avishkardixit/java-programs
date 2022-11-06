import java.util.Locale;

public class StringMethods
{
    public static void main(String[] args)
    {
        String s = "Avishkar Dixit ";

//        int a= s.length(); //finds lenght of string
//
//        System.out.println(a);

        System.out.printf("lenght : %d  \n",s.length());

        String sl=s.toLowerCase();      //convert string to lowercase
        System.out.println("lowercase string : "+sl);

         String su=s.toUpperCase();      //convert string to Uppercase
        System.out.println("Uppercase string : "+su);


        String ft = "     BANG      ";
         String t=ft.trim();      //trim the string by deleting spaces before and after
        System.out.println("trimmed string : "+t);

        String ss=s.substring(3,6);      //substring
        System.out.println("Substring  : "+ss);

        String sr=s.replace('i','u');      //replace char
        System.out.println("repaced char string   : "+sr);

        boolean sb=s.startsWith("mb");      //check strast with
        System.out.println("is string strats with  mb ??: "+sb );

        boolean se=s.endsWith("it ");      //checks ends with
        System.out.println("is string ends  with  it ?? "+se );

        char sc=s.charAt(5);      //checks ends with
        System.out.println("what is the charector at index 5 = "+sc );





    }
}
