public class Fibnocci{
    public static void main(String argsv[]){
        int a=0, b=1,c,n=7;
        System.out.println(a+"\n"+b);
        for(int i=2;i<n;i++)
        {
            c=a+b; 
            a=b;
            b=c;                    
            System.out.println(c);
 
        }
    }
}