//Q1
package Assignment8_Collection;

import java.util.*;

public class Search_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <Integer> list=new ArrayList<Integer>();
		
		list.add(10);
		list.add(25);
		list.add(30);
		list.add(40);
		list.add(50);
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the searching number");
		
		int search=sc.nextInt();
		
		if(list.contains(search)) {
			System.out.println(search+" element found in list");
		}else {
			System.out.println(search+"not foun in list");
		}

	}

}
