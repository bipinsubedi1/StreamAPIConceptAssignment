import java.util.function.Predicate;
public class PredicateExample {
	public static void main(String[] args)
    {
        // Creating predicate
        Predicate<Integer> lesserthan = i -> (i < 19); 
  
        // Calling Predicate method
        System.out.println(lesserthan.test(5)); 
    }
}
