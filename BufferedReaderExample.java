import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {
    public static void main(String[] args)throws IOException
    {
        String filepath="C:\\Users\\Nazeerbabu\\OneDrive\\Desktop\\JavaCourse\\File2.txt";
        File f1= new File(filepath);
        FileReader r1=null;
        BufferedReader bw=null;
        try{
            r1= new FileReader(filepath);
            bw= new BufferedReader(r1);
            String str=bw.readLine();
            while(str!=null)
            {
                System.out.println(str);
                str=bw.readLine();
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally{
            bw.close();
        }
        
    }
    
}
