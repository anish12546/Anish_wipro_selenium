package Assignment_3;

public class frequency_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="hello world";
		int freq[]=new int[26];
		//int count=0;
		
		for(int i=0;i<str.length();i++) {
			
			char ch=str.charAt(i);
			
			if(ch>='a'&&ch<='z') {
				freq[ch-'a']++;
				
			}
			
			
		}
		for(int i=0;i<26;i++) {
			if(freq[i]>0) {
				System.out.println((char)(i+'a')+" :"+freq[i]);
			}
		}

	}

}
