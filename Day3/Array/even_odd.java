package assignmentt3_array;

public class even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,4,5,6};
		int even=0;
		int odd=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				even++;
				
			}else {
				odd++;
			}
		}
		
		System.out.println("even number in array :"+even);
		System.out.println("odd number in array :"+odd);

	}

}
