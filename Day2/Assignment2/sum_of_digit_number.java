package assignment2;

public class sum_of_digit_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=6785;
		int total=0;
		
		
		while(num>0) {
			int digit=num%10;
			total=total+digit;
			num=num/10;	
			
		}
		System.out.println(total);
		
	}

}
