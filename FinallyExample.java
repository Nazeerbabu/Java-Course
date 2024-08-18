public class FinallyExample{
    public static void main(String[] args)
    {
        int i=0;
        int j=0;
        try{
        
        j=20/20; 
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        finally{

        System.out.println(j);
    }

    }
}