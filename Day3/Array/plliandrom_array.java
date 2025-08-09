package assignmentt3_array;

public class plliandrom_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr= {1,2,3,2,1};
		
		boolean ispalliandrom=true;
		
		int left=0;
		int right=arr.length-1;
		
		while(left<right) {
			
			if(arr[left]!=arr[right]) {
				ispalliandrom=false;
				break;
			}
			left++;
			right--;
			
		}
		if(ispalliandrom) {
			System.out.println("palliandrom");
		}else {
			System.out.println("not palliandrom");
		}
		

	}

}
