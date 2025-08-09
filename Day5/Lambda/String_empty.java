package assignment_5;
import java.util.function.Predicate;
public class String_empty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Predicate<String> isEmpty = s -> s.isEmpty();

	        // Test cases
	        System.out.println(isEmpty.test(""));

	}

}
