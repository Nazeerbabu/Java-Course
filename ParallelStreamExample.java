import java.util.*;
public class ParallelStreamExample {
    public static void main(String[] args)
    {
         List<Integer> nums= Arrays.asList(4,5,6,7,2,3,9);

         int result= nums.stream()
                         .filter(n->n%2==0)
                         .map(n->n*2)
                         .reduce(0,(c,e)->c+e);
    System.out.println(result);
    int r1= nums.parallelStream()
    .filter(n->n%2==0)
    .mapToInt(n->n)
    .sum();

    System.out.println(r1);
    


    }
}
