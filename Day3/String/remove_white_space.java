package Assignment_3;

public class remove_white_space {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="this is a simple program";
		
		String newstr=str.replaceAll("\\s+", "");
		
		System.out.println("original sentense :"+ str);
		System.out.println("modified sentense :"+newstr);

	}

}
