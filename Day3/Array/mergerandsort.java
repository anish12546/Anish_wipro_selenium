package assignmentt3_array;

import java.util.Arrays;

public class mergerandsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[]= {5, 2, 8, 12};;
		
		int arr2[]={7, 3, 10, 6};
		int n=arr1.length+arr2.length;
		int merge[]=new int[n];
		
		for(int i=0;i<arr1.length;i++) {
			merge[i]=arr1[i];
		}
		
		for(int i=0;i<arr2.length;i++) {
			merge[arr1.length+i]=arr2[i];
		}
		
		Arrays.sort(merge);
		
		for(int num:merge) {
			System.out.print(num+" ");
		}
				
				

	}

}
