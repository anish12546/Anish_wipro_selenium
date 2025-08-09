package Assignment_3;

public class replace_hyphens {
	public static void main(String args[]) {
		
		String str="this is a simple string";
		
		String result=str.replaceAll(" ", "-");
		
		System.out.println("Original String: "+str);
		System.out.println("Modified String: " + result);
	}

}
