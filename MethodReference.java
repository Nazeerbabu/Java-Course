import java.util.*;
public class MethodReference {
    public static void main(String[] args)
    {
        List <String> names= Arrays.asList("Nazeer","Randheer","Bharath");

       List<String> unames= names.stream()
                       .map(String:: toUpperCase)
                       .toList();

    unames.forEach(System.out::println);
    }
}
