import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args)throws IOException
    {
        String filepath="C:\\Users\\Nazeerbabu\\OneDrive\\Desktop\\JavaCourse\\File2.txt";
        File f1= new File(filepath);
        FileReader r1=null;
        try{
            r1= new FileReader(filepath);
            char ch[]=new char[(int)f1.length()];
            r1.read(ch);
            for(char c:ch)
            {
                System.out.println(c);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally{
            r1.close();
        }
        
    }
    
}
