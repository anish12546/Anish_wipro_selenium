package assignment_4;


class calculator{
	
	int add(int a,int b) {
		return a+b;
	}
	
	int add(int a,int b,int c) {
		return a+b+c;
	}
	
	double add(double a,double b) {
		return a+b;
	}
	
}
public class calculator_overload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		calculator cal=new calculator();
		
		System.out.println(cal.add(1, 2));
		System.out.println(cal.add(1.2, 1.3));
		System.out.println(cal.add(1, 2,3));

	}

}
