import java.util.Optional;  
public class OptionalClass {
	public static void main(String[] args) {  
        String[] str = new String[5];        
        str[3] = "DEMO OF OPTIONAL CLASS.";// Setting value for 3rd index  
        Optional<String> checkNull = Optional.ofNullable(str[3]);  
        if(checkNull.isPresent()){  // It Checks to see value is present or not  
            String lowercaseString = str[3].toLowerCase();  
            System.out.print(lowercaseString);  
        }else  
            System.out.println("There is no string value.");  
    }  
}
