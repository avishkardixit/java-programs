import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readFromFile {

    public static void main(String[] args) {

        File f1 = new File("contennt.txt");

        try {
            Scanner sc = new Scanner(f1);

            while(sc.hasNextLine())
            {
                System.out.println(sc.nextLine());
            }
            sc.close();

        }catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }

        f1.delete(); //these will delet the file

    }
}
