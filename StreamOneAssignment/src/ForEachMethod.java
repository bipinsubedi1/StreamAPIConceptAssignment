import java.util.ArrayList;  
import java.util.List;  
public class ForEachMethod {
	public static void main(String[] args) {  
        List<String> gamesList = new ArrayList<String>();  
        gamesList.add("Soccer");  
        gamesList.add("Baseball");  
        gamesList.add("Basketball");  
        gamesList.add("Ice Hocky");  
        System.out.println("------------Demo of iteration by passing lambda expression--------------");  
        gamesList.forEach(games -> System.out.println(games));  
          
    }  
}
