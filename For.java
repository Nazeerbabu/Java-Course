public class For{
    public static void main(String[] args)
    {
        String s ="Nazeer";
        int a =s.length();
        String r="";
       for(int i=a-1;i>=0;i--)
       {
        r=r+s.charAt(i);
       }
       System.out.println(r);
    }
}