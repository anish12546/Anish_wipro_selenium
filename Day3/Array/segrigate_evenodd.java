package assignmentt3_array;

public class segrigate_evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,4,5,6,7,8,9};
		int n=arr.length;
		int evenindex=0;
		int oddindex=n-1;
		int temp[]=new int[n];
		
		for(int num:arr) {
			
			if(num%2==0) {
			temp[evenindex++]=num;
		}else {
			temp[oddindex--]=num;
		}
		}
		
		System.out.println("after number seggrigate");
		
		for(int i=0;i<temp.length;i++) {
			System.out.print(temp[i]+" ");
		}
		
	}

}
