package assignmentt3_array;

public class sum_element_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,4};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		
		System.out.println("sum of element in array :"+sum);

	}

}
