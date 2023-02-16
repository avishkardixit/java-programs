import java.io.File;

public class createFile {

    public static void main(String[] args) {

        File f1 = new File(content.txt);

        try {
            f1.createNewFile();
        }catch (Exception e)
        {
            System.out.println("unable to create a file ");
            e.printStackTrace();
        }
    }
}
