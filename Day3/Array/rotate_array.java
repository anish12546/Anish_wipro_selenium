package assignmentt3_array;

public class rotate_array {
	
	void leftrotate(int arr[],int d,int n) {
		
		
		int temp[]=new int[d];
		
		for(int i=0;i<d;i++) {
			temp[i]=arr[i];
		}
		
		
		for(int i=d;i<n;i++) {
			arr[i-d]=arr[i];
		}
		
		for(int i=0;i<d;i++) {
			arr[i+n-d]=temp[i];
		}
	}
	void print(int arr[],int n) {
		
		for(int i=0;i<n;i++) {
		System.out.print(arr[i]+" ");
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rotate_array rotate=new rotate_array();
		int arr[]= {1,2,3,4,5};
		int d=2;
		
		rotate.leftrotate(arr, d, arr.length);
		
		rotate.print(arr, arr.length);
	}

}
