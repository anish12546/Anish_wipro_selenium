//Q10
package Assignment8_Collection;

import java.util.ArrayList;

public class ArrayListCopy {
    public static void main(String[] args) {
        
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Red");
        list1.add("Green");
        list1.add("Blue");
        list1.add("Yellow");

        
        ArrayList<String> list2 = new ArrayList<>();

        
        list2.addAll(list1);

        
        System.out.println("List1: " + list1);
        System.out.println("List2 (after copy): " + list2);
    }
}
