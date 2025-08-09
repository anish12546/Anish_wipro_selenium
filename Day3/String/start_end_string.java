package Assignment_3;

public class start_end_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="java";
		
		if(str.toLowerCase().startsWith("j")&& str.toLowerCase().endsWith("a")) {
			System.out.println(str+ " starts with 'j' and ends with 'a'.");
		}else {
			System.out.println(str +" does not meet the condition");
		}

	}

}
