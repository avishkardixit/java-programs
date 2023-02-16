import java.io.FileWriter;
import java.io.IOException;

public class writeInFile {
    public static void main(String[] args) {

        try{
            FileWriter f1 = new FileWriter("contennt.txt");
            f1.write("thise is the first text in the file ");
            f1.close();
        }catch (IOException e)
        {
            System.out.println("Unable to write ");
            e.printStackTrace();
        }

    }
}
