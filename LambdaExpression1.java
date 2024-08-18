import java.lang.FunctionalInterface;
@FunctionalInterface
interface A{
    void show();
}
public class LambdaExpression1{
    public static void main(String[] args)
    {
        A obj= () -> System.out.println("In Show:");
            obj.show();
        }
    }
