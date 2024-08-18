public class Prime{
    public static void main(String[] args)
    {
        int n=2,count=0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                count=1;
            }
        }
        if(count==0)
        {
          System.out.println("Is Prime");
        }
        else
        {
            System.out.println("Not a Prime");
        }
        
    }
}