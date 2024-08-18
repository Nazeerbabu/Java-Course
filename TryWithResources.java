import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResources {

    public static void main(String[] args) throws NumberFormatException, IOException
    {
        int num=0;
        System.out.println("Enter a Number:");
        try(BufferedReader br= new BufferedReader(new InputStreamReader(System.in)))
        {
            num=Integer.parseInt(br.readLine());
            System.out.println(num);
        }
    }
    
}
