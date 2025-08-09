package Assignment_3;

public class palliandrom_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean ispalliandrom=true;
		String str="madaam";
		int len=str.length();
		
		for(int i=0;i<len;i++) {
			if(str.charAt(i)!= str.charAt(len-1-i)) {
				ispalliandrom=false;
				break;
			}
		}
		
		if(ispalliandrom) {
			System.out.println("palliandrom");
		}else {
			System.out.println("not palliandrom");
		}
		

	}

}
