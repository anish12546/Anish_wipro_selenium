//Q3
package Assignment8_treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetCustom {
    public static void main(String[] args) {
        // Custom comparator to sort strings in reverse order
        TreeSet<String> reversedSet = new TreeSet<>(Comparator.reverseOrder());

        reversedSet.add("Apple");
        reversedSet.add("Mango");
        reversedSet.add("Banana");
        reversedSet.add("Orange");
        reversedSet.add("Grapes");

        System.out.println("Strings in reverse alphabetical order: " + reversedSet);
    }
}
