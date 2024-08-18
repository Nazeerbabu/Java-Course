import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable
{
    public int age;
    public String name;
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
    
    public void display(){
        System.out.println("Age : "+ age);
        System.out.println("Name " + name);
    }
}
public class SerializationExample{
    public static void main(String[] args) throws IOException
    {
        Student s1= new Student(26,"Nazeer");
        s1.display();
        String filepath="C:\\Users\\Nazeerbabu\\OneDrive\\Desktop\\JavaCourse\\Serialization.txt";
        try{
        File f1= new File(filepath);
        f1.createNewFile();
        FileOutputStream fos= new FileOutputStream(filepath);
        BufferedOutputStream bos= new BufferedOutputStream(fos);
        ObjectOutput oos= new ObjectOutputStream(bos);
        oos.writeObject(s1);
        oos.close();
        fos.close();

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
}
}

