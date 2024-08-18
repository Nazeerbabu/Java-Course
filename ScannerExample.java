import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.IOException;

public class ScannerExample {
    public static void main(String [] args) throws IOException
    {
        System.out.println("Enter a number:");
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(num);
    }
}