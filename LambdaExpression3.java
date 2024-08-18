import java.lang.FunctionalInterface;
@FunctionalInterface
interface A{
    int show(int i,int j);
}
public class LambdaExpression3{
    public static void main(String[] args)
    {
        A obj= (i,j) ->  i+j;
            int r= obj.show(5,5);
            System.out.println(r);
        }
    }