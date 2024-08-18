import java.io.File;
import java.io.IOException;
import java.util.*;

public class FileCreation {

    public static void main(String[] args)
    {
        try{
        File f1= new File("C:\\Users\\Nazeerbabu\\OneDrive\\Desktop\\JavaCourse\\File1.txt");
        System.out.println(f1.exists());
            f1.createNewFile();
        System.out.println(f1.exists());
        System.out.println(f1.isFile());
        System.out.println(f1.getPath());

        }
        catch(Exception e)
        {
            System.out.println(e);
        }

File f2 = new File("C:\\Users\\Nazeerbabu\\OneDrive\\Desktop\\JavaCourse");
     String[] r= f2.list();
     int c=0;
     for (String s:r)
     { c++;
        System.out.println(r);
     }
    System.out.println(c);
    }
    
}
