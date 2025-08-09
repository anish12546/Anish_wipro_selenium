package Assignment_7;

public class WrapperDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String nullString = null;

	        try {
	            Integer num = Integer.valueOf(nullString);  // throws NumberFormatException
	        } catch (NumberFormatException | NullPointerException e) {
	            System.out.println("Cannot convert null to Integer: " + e);
	        }

	        // Safely assigning null to a wrapper (works)
	        Integer safeNull = null;
	        System.out.println("Safe null Integer: " + safeNull);

	}

}
