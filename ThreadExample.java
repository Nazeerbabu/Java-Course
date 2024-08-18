class A extends Thread{
    public void run()
    {
        for(int i=0;i<5;i++)
        { 
            System.out.println("Hi");
            try
            {
       
        Thread.sleep(100);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
}
class B extends Thread{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
        System.out.println("Nazeer");
        try{
            Thread.sleep(500);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        }
    }
}



public class ThreadExample {
    
    public static void main(String[] args)
    {
         A obj1= new A();
         B obj2= new B();
         obj1.start();
         obj2.start();
    }

}


