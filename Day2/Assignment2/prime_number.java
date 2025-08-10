package assignment2;

public class prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=29;
		boolean isprime=true;
		
		for(int i=2;i<num;i++) {
			
			if(num%2==0) {
				isprime=false;
				break;
			}
		}
		
		if(isprime) {
			System.out.println("prime");
		}else {
			System.out.println("not prime");
		}
		

	}

}
