package assignmentt3_array;
import java.util.*;


public class binary_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int arr[]= {1,2,3,4,10,9};
		System.out.println("Enter the number");
		
		int num=sc.nextInt();
		boolean isfound=false;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num) {
				isfound=true;
				break;
				
			}
				
		}
		if(isfound) {
			System.out.println("found the number");
		}else {
			System.out.println("not found number");
		}
		

	}
}


