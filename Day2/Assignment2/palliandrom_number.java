package assignment2;

public class palliandrom_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=1211;
		
		int rev=0;
		
		int temp=num;
		
		while(num>0) {
			int digit=num%10;
			rev=rev*10+digit;
			num/=10;
		}
		
		if(temp==rev) {
			System.out.println("palliandron number");
		}else {
			System.out.println("not palliandrom number");
		}

	}

}
