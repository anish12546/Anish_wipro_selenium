package assignment_5;

interface Sum {
    int add(int a, int b);
}

public class add_lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Sum sumFunction = (a, b) -> a + b;

	        // Test the lambda
	        int result = sumFunction.add(5, 7);
	        System.out.println("Sum: " + result);
	}

}
