package Assignment_3;

public class split_sentense_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="this  is a simple program";
		
		String[] str1=str.split("\\s+");
		
		for(String result:str1) {
			System.out.print(result+" ");
		}
	}

}
