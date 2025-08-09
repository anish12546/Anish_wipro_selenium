//Q6
package Assignment8_Collection;

import java.util.ArrayList;

public class UpdateSubject {
    public static void main(String[] args) {
       
        ArrayList<String> subjects = new ArrayList<>();
        subjects.add("English");
        subjects.add("Math");
        subjects.add("Science");
        subjects.add("History");
        subjects.add("Computer");

        
        System.out.println("Before update: " + subjects);

        
        int index = subjects.indexOf("Math");
        if (index != -1) {
            subjects.set(index, "Statistics");
        } else {
            System.out.println("Subject 'Math' not found.");
        }

        
        System.out.println("After update: " + subjects);
    }
}
