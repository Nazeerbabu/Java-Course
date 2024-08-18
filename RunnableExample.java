public class RunnableExample {
    public static void main(String[] args)
    {
        Runnable obj1=()->
        {
            for(int i=0;i<5;i++)
            {
                System.out.println("Nazeer");
                try {Thread.sleep(50);} catch(InterruptedException e){e.printStackTrace();}
                }
        };
        Runnable obj2=()-> 
        {
            for(int i=0;i<5;i++)
            {
                System.out.println("Babu");
                try {Thread.sleep(60);} catch(InterruptedException e){e.printStackTrace();}
            }
        };
        Thread t1= new Thread(obj1);
        Thread t2=new Thread(obj2);
        t1.start();
        t2.start();
    }
    
}
