//Q5
package Assignment8_Collection;
import java.util.ArrayList;
import java.util.Collections;

public class ReversedArrayList {
    public static void main(String[] args) {
        
        ArrayList<Character> characters = new ArrayList<>();

        
        characters.add('A');
        characters.add('B');
        characters.add('C');
        characters.add('D');
        characters.add('E');

       
        System.out.println("Original list: " + characters);

        
        Collections.reverse(characters);

        
        System.out.println("Reversed list: " + characters);
    }
}
