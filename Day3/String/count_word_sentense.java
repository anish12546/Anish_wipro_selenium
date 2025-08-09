package Assignment_3;

public class count_word_sentense {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//("\\s+") splits the sentence by one or more whitespace characters.
		//trim() removes leading and trailing spaces.
		
		
		String str=" this is a simple program ";
		
		String[] words=str.trim().split("\\s+");
		
		int wordcount=words.length;
		
		System.out.println("total word count in sentense :"+wordcount);

	} 

}
