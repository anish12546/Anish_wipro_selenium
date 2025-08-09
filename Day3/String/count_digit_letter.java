package Assignment_3;

public class count_digit_letter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="java @1210";
		
		int digit=0;
		int letter=0;
		int space=0;
		int specialcharacter=0;
		
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			
			if(Character.isDigit(ch)) {
				digit++;
			}else if(Character.isLetter(ch)) {
				letter++;
			}else if(Character.isWhitespace(ch)) {
				space++;
				
			}else {
				specialcharacter++;
			}
		}
		
		System.out.println("total digit  :"+digit);
		System.out.println("total letter :"+letter);
		System.out.println("total space  :"+space);
		System.out.println("total specialcharacter :"+specialcharacter);

	}

}
