package assignment_5;

interface SumCalculator{
int sum(int a,int b);
}

public class calculator_lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumCalculator calc = (a, b) -> a + b;

        // Use the lambda
        int result = calc.sum(10, 25);

        System.out.println("Sum: " + result);
	}

}
