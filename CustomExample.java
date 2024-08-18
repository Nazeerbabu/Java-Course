class NazeerException extends Exception{
    NazeerException(String name)
{
super(name);
}
    }

public class CustomExample{
    public static void main(String[] args)
    {
        int i=0;
        int j=0;
        try{
        
        j=18/20; 
        if (j==0)throw new NazeerException("Hi");
        }
        catch(NazeerException e)
        {
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }

        System.out.println(j);
    }
}