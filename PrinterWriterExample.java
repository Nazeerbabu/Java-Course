import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrinterWriterExample {

    public static void main(String[] args) throws IOException {
        String filepath = "C:\\Users\\Nazeerbabu\\OneDrive\\Desktop\\JavaCourse\\File4.txt";
        FileWriter f=null;
        PrintWriter p=null;
        
        try {
            File file = new File(filepath);
            
                file.createNewFile();
              f= new FileWriter(file, true);
              p = new PrintWriter(f);

          //  p.write(65);
            p.print("Nazeer ");
            p.print("Is ");  
            p.print("a ");  
            char c[] = {'p', 'r', 'o', 'g', 'r', 'a', 'm', 'm', 'e', 'r'};
            p.print(c);
            p.println(" 100%");

        } catch (IOException e) {
            System.out.println(e);
        } finally {
           
                    p.close(); // Close the FileWriter to ensure all data is written and resources are released
                
                }
            }
        }
    
