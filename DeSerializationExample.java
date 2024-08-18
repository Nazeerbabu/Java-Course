import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
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
public class DeSerializationExample{
    public static void main(String[] args) throws IOException
    {
        String filepath="C:\\Users\\Nazeerbabu\\OneDrive\\Desktop\\JavaCourse\\Serialization.txt";
        try{
        FileInputStream fis= new FileInputStream(filepath);
        BufferedInputStream bis= new BufferedInputStream(fis);
        ObjectInputStream ois= new ObjectInputStream(bis);
        Student s1= (Student)ois.readObject();
        s1.display();
        fis.close();
        ois.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
}
}

