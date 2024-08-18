import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

    public static void main(String[] args) throws IOException {
        String filepath = "C:\\Users\\Nazeerbabu\\OneDrive\\Desktop\\JavaCourse\\File2.txt";
        FileWriter f1=null;
        
        try {
            File file = new File(filepath);
            
                file.createNewFile();

              f1 = new FileWriter(file, true);

            f1.write("Nazeer");
            f1.write("Is");
            f1.write(String.valueOf(65));  // Writes the string "65" instead of the ASCII character
            char c[] = {'p', 'r', 'o', 'g', 'r', 'a', 'm', 'm', 'e', 'r'};
            f1.write(c);
            f1.write("Thank you");

        } catch (IOException e) {
            System.out.println(e);
        } finally {
           
                    f1.close(); // Close the FileWriter to ensure all data is written and resources are released
                
                }
            }
        }
    
