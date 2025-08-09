package assignmentt3_array;

public class second_highest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,4,5,6,7};
		int high=arr[0];
		int secondhigh=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			
			if(high<arr[i]) {
				high=arr[i];
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			
			if(high!=arr[i] && secondhigh<arr[i]) {
				secondhigh=arr[i];
			}
			
		}
		System.out.println("second highest number :"+secondhigh);
		
		

	}

}
