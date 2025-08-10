package assignment2;

import java.util.*;


public class diamond_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of rows");
		int num=sc.nextInt();
		
		// Uppper part
		
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num-i;j++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//bottom part
		
		for(int i=num-1;i>=1;i--) {
			for(int j=1;j<=num-i;j++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
