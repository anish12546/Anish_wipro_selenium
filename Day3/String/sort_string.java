package Assignment_3;

import java.util.Arrays;

public class sort_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="java";
		
		char[]ch=str.toCharArray();
		
		Arrays.sort(ch);
		
		String newstr=new String(ch);
		
		System.out.println("original :"+str);
		System.out.println("sorted :"+newstr);

	}

}
