public class BreakContinue
{
    public static void main(String[] args)
    {
        int i=1;
        for(i=1;i<=10;i++)
        {
            if(i==5)
            {
                continue;
            }
            if(i==9)
            {
                break;
            }
            System.out.println(i);
        }
    }
}