import java.io.File;
import java.io.IOException;

public class createFile {
    public static void main(String[] args) {
        File f1 = new File("contennt.txt");

        try
        {
            f1.createNewFile();
        }
        catch (IOException e)
        {
            System.out.println("Unable to create a file ...");
            e.printStackTrace();
        }
    }
}
