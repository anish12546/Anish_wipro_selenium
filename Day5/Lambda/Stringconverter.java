package assignment_5;

import java.util.function.Function;


public class Stringconverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function <String,String > toupper=s->s.toUpperCase();
		Function <String,String > tolower=s->s.toLowerCase();
		
		String input="Hello";
		
		System.out.println(toupper.apply(input));
		System.out.println(tolower.apply(input));

	}

}
