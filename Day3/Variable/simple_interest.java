package Assignment_3;

public class simple_interest {
	
	double calculate(double principle1,double interest1,double time1) {
		return (principle1*interest1*time1)/100;
	}
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		simple_interest simple=new simple_interest();
		
		double result=simple.calculate(10000, 10.5, 10);
		System.out.println("simple interest is :$"+result);
		

	}

}
