package assignment2;

public class fiboonaci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		
		int b=1;
		int n=5;
		
		//System.out.println(a);
		for(int i=1;i<=n;i++) 
		{
		int temp=a+b;
		System.out.println(a);
		a=b;
		b=temp;
		}
	}

}
