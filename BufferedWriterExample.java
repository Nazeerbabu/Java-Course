import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {

    public static void main(String[] args) throws IOException {
        String filepath = "C:\\Users\\Nazeerbabu\\OneDrive\\Desktop\\JavaCourse\\File3.txt";
        FileWriter f1=null;
        BufferedWriter bw=null;
        
        try {
            File file = new File(filepath);
            
                file.createNewFile();

              f1 = new FileWriter(file, true);
              bw= new BufferedWriter(f1);

            bw.write("Nazeer");
            bw.newLine();
            bw.write("Is");
            bw.newLine();
            bw.write(65);  
            bw.newLine();
            char c[] = {'p', 'r', 'o', 'g', 'r', 'a', 'm', 'm', 'e', 'r'};
            bw.write(c);
            bw.newLine();
            bw.write("Thank you");
            bw.newLine();
            System.out.println("Successfull");
        } catch (IOException e) {
            System.out.println(e);
        } finally {
           
                    bw.close(); 
                
                }
            }
        }
    
