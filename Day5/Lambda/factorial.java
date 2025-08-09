package assignment_5;


interface factorials{
	int factorial(int a);
	
}
public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		factorials fac=(a)->{
			int result=1;
			for(int i=2;i<=a;i++) {
				result*=i;
			}
			return result;
		};
		System.out.println(fac.factorial(5));

	}

}
