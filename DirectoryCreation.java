import java.io.File;
import java.io.IOException;
import java.util.*;

public class DirectoryCreation {

    public static void main(String[] args)
    {
        try{
        File f1= new File("C:\\Users\\Nazeerbabu\\OneDrive\\Desktop\\JavaCourse\\MyDir");
        System.out.println(f1.exists());
            f1.mkdir();
            f1.mkdirs();
        System.out.println(f1.exists());
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
    
}
