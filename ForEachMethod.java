import java.util.Arrays;
import java.util.function.Consumer;
import java.util.*;

public class ForEachMethod {
    public static void main(String[] args)
    {
        List<Integer> nums= Arrays.asList(4,5,6,2,3,9);

    
        nums.forEach(n->System.out.println(n));
        
    }
    
}

