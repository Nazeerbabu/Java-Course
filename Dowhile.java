public class DoWhile
{
    public static void main(String[] args)
    {
        String s="Nazeer";
        int a=s.length();
        String r="";
        int i=a-1;
        do{
            r=r+s.charAt(i);
            i--;
        }while(i>=0);
        System.out.println(r);
    }
}