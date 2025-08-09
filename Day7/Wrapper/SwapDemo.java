//Q2
package Assignment_7;

public class SwapDemo {
	
	public static void swap(int a,int b) {
		int temp=a;
		a=b;
		b=a;
		System.out.println(" Inside method after swap a :"+a);
		System.out.println("Inside method after swap b :"+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		System.out.println("before swap a"+a);
		System.out.println("before swap b"+b);
		
		swap(a, b);
		
		System.out.println("after swap a "+a);
		System.out.println("after swap b "+b);

	}

}
